package com.github.youssfbr.cursomc.controllers;

import com.github.youssfbr.cursomc.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

    @GetMapping
    public List<Category> list() {

        final Category cat1 = new Category(1L , "Computing");
        final Category cat2 = new Category(2L , "Office");

        return Arrays.asList(cat1, cat2);
    }
}
