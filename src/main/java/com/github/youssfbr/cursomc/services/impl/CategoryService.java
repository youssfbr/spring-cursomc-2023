package com.github.youssfbr.cursomc.services.impl;

import com.github.youssfbr.cursomc.dtos.CategoryCreateRequestDTO;
import com.github.youssfbr.cursomc.dtos.CategoryResponseDTO;
import com.github.youssfbr.cursomc.dtos.CategoryUpdateRequestDTO;
import com.github.youssfbr.cursomc.entities.Category;
import com.github.youssfbr.cursomc.repositories.ICategoryRepository;
import com.github.youssfbr.cursomc.services.ICategoryService;
import com.github.youssfbr.cursomc.services.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final ICategoryRepository categoryRepository;
    private static final String ID_NOT_FOUND_MESSAGE = "Resource not found with id ";

    @Override
    @Transactional(readOnly = true)
    public List<CategoryResponseDTO> findAll() {
        return categoryRepository.findAllByActiveTrue()
                .stream()
                .map(CategoryResponseDTO::new)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public CategoryResponseDTO findById(Long id) {
        return categoryRepository.findById(id)
                .map(CategoryResponseDTO::new)
                .orElseThrow(() -> new ResourceNotFoundException(ID_NOT_FOUND_MESSAGE + id));
    }

    @Override
    @Transactional
    public CategoryResponseDTO createCategory(CategoryCreateRequestDTO categoryCreateRequestDTO) {

        final Category productToCreate = new Category(categoryCreateRequestDTO);
        final Category productCreated = categoryRepository.save(productToCreate);

        return new CategoryResponseDTO(productCreated);
    }

    @Override
    @Transactional
    public CategoryResponseDTO updateCategory(CategoryUpdateRequestDTO categoryUpdateRequestDTO) {

        final Category categoryToUpdate = existsCategory(categoryUpdateRequestDTO.id());
        BeanUtils.copyProperties(categoryUpdateRequestDTO, categoryToUpdate);

        final Category productUpdated = categoryRepository.save(categoryToUpdate);
        return new CategoryResponseDTO(productUpdated);
    }

    private Category existsCategory(Long id) {
        return categoryRepository.findByIdAndActiveTrue(id).
                orElseThrow(() -> new ResourceNotFoundException(ID_NOT_FOUND_MESSAGE + id));
    }
}
