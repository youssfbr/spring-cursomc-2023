package com.github.youssfbr.cursomc.dtos;

import com.github.youssfbr.cursomc.entities.City;


public record CityResponseDTO(
        Long id ,
        String name
) {
    public CityResponseDTO(City city) {
        this(
                city.getId() ,
                city.getName()
        );
    }
}
