package com.github.youssfbr.cursomc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "tb_customer")
@EqualsAndHashCode(of = "id")
public class Customer {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(length = 100, nullable = false)
    private String name;

    @NonNull
    @Column(length = 80, nullable = false)
    private String email;

    @NonNull
    @Column(length = 20, nullable = false)
    private String cpfOrCnpj;

    @NonNull
    private Integer customerType;

    @OneToMany(mappedBy = "customer")
    private final List<Address> addresses = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "tb_phone")
    private final Set<String> phones = new HashSet<>();

    @OneToMany(mappedBy = "customer")
    private final List<Order> orders = new ArrayList<>();


    private Boolean active;

    @Column(updatable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedAt;


    @PrePersist
    private void prePersist() {
        active = Boolean.TRUE;
        createdAt = Instant.now();
    }

    @PreUpdate
    private void preUpdate() {
        updatedAt = Instant.now();
    }

}
