package com.github.youssfbr.cursomc.controllers;

import com.github.youssfbr.cursomc.dtos.CategoryCreateRequestDTO;
import com.github.youssfbr.cursomc.dtos.CategoryDeleteRequestDTO;
import com.github.youssfbr.cursomc.dtos.CategoryResponseDTO;
import com.github.youssfbr.cursomc.dtos.CategoryUpdateRequestDTO;
import com.github.youssfbr.cursomc.services.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<Page<CategoryResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(categoryService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.findById(id));
    }

    @PostMapping
    public ResponseEntity<CategoryResponseDTO> createCategory(@RequestBody CategoryCreateRequestDTO categoryCreateRequestDTO) {

        final CategoryResponseDTO categoryCreated = categoryService.createCategory(categoryCreateRequestDTO);
        final Long id = categoryCreated.id();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id).toUri();

        return ResponseEntity.created(location).body(categoryCreated);
    }

    @PutMapping
    public ResponseEntity<CategoryResponseDTO> updateCategory(@RequestBody CategoryUpdateRequestDTO dto) {
        return ResponseEntity.ok(categoryService.updateCategory(dto));
    }

    @DeleteMapping
    public ResponseEntity<Void> updateProduct(@RequestBody CategoryDeleteRequestDTO dto) {

        categoryService.deleteCategory(dto);

        return ResponseEntity.noContent().build();
    }
}
