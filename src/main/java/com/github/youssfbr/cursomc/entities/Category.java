package com.github.youssfbr.cursomc.entities;

import com.github.youssfbr.cursomc.dtos.CategoryCreateRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_category")
@EqualsAndHashCode(of = "id")
public class Category extends BaseItem {

    @Column(length = 50, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "categories")
    private final Set<Product> products = new HashSet<>();

    public Category(CategoryCreateRequestDTO dto) {
        name = dto.name();
    }

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
