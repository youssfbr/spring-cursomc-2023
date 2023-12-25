package com.github.youssfbr.cursomc.repositories;

import com.github.youssfbr.cursomc.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllByActiveTrue();
    Optional<Category> findByIdAndActiveTrue(Long id);
    boolean existsByNameIgnoreCaseContaining(String name);
}
