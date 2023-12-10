package com.github.youssfbr.cursomc.services;

import com.github.youssfbr.cursomc.dtos.CategoryResponseDTO;
import com.github.youssfbr.cursomc.entities.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    CategoryResponseDTO findById(Long id);
}
