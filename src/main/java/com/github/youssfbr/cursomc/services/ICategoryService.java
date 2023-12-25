package com.github.youssfbr.cursomc.services;

import com.github.youssfbr.cursomc.dtos.CategoryCreateRequestDTO;
import com.github.youssfbr.cursomc.dtos.CategoryResponseDTO;

import java.util.List;

public interface ICategoryService {
    List<CategoryResponseDTO> findAll();
    CategoryResponseDTO findById(Long id);
    CategoryResponseDTO createCategory(CategoryCreateRequestDTO categoryCreateRequestDTO);
}
