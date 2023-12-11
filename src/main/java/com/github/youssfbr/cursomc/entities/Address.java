package com.github.youssfbr.cursomc.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "tb_address")
@EqualsAndHashCode(of = "id")
public class Address {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String publicPlace;

    @NonNull
    private String number;

    @NonNull
    private String complement;

    @NonNull
    private String district;

    @NonNull
    private String cep;

    @NonNull
    @ManyToOne
    private Customer customer;

    @NonNull
    @ManyToOne
    private City city;
}
