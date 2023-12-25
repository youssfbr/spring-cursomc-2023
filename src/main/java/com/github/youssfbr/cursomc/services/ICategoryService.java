package com.github.youssfbr.cursomc.services;

import com.github.youssfbr.cursomc.dtos.CategoryCreateRequestDTO;
import com.github.youssfbr.cursomc.dtos.CategoryDeleteRequestDTO;
import com.github.youssfbr.cursomc.dtos.CategoryResponseDTO;
import com.github.youssfbr.cursomc.dtos.CategoryUpdateRequestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService {
    Page<CategoryResponseDTO> findAll(Pageable pageable);
    CategoryResponseDTO findById(Long id);
    CategoryResponseDTO createCategory(CategoryCreateRequestDTO categoryCreateRequestDTO);
    CategoryResponseDTO updateCategory(CategoryUpdateRequestDTO categoryUpdateRequestDTO);
    void deleteCategory(CategoryDeleteRequestDTO categoryDeleteRequestDTO);
}
