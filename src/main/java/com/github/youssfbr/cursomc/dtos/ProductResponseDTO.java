package com.github.youssfbr.cursomc.dtos;

import com.github.youssfbr.cursomc.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public record ProductResponseDTO(
        Long id ,
        String name ,
        String description ,
        Integer quantity ,
        BigDecimal costPrice ,
        BigDecimal salePrice ,
        String note ,
        List<String> imgUrl
) {
    public ProductResponseDTO(Product product){
        this(
            product.getId() ,
            product.getName() ,
            product.getDescription() ,
            product.getQuantity() ,
            product.getCostPrice() ,
            product.getSalePrice() ,
            product.getNote() ,
            product.getImgUrl()
        );
    }
}
