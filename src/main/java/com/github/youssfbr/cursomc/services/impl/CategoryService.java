package com.github.youssfbr.cursomc.services.impl;

import com.github.youssfbr.cursomc.dtos.CategoryResponseDTO;
import com.github.youssfbr.cursomc.entities.Category;
import com.github.youssfbr.cursomc.repositories.ICategoryRepository;
import com.github.youssfbr.cursomc.services.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final ICategoryRepository categoryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CategoryResponseDTO findById(Long id) {
        return categoryRepository.findById(id)
                .map(CategoryResponseDTO::new)
                .orElseThrow(null);
    }
}
