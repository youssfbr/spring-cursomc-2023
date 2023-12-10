package com.github.youssfbr.cursomc.services;

import com.github.youssfbr.cursomc.entities.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(Long id);
}
