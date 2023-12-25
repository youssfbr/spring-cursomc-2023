package com.github.youssfbr.cursomc.repositories;

import com.github.youssfbr.cursomc.entities.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
    Page<Category> findAllByActiveTrue(Pageable pageable);
    Optional<Category> findByIdAndActiveTrue(Long id);
    boolean existsByNameIgnoreCaseContaining(String name);
}
