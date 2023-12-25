package com.github.youssfbr.cursomc.entities.enums;

import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public enum CustomerType {

    PESSOA_FISICA(0, "Pessoa Física"),
    PESSOA_JURIDICA(1, "Pessoa Jurídica");

    private final int id;
    private final String description;

    CustomerType(int id , String description) {
        this.id = id;
        this.description = description;
    }

    @SneakyThrows
    public static CustomerType toEnum(Integer id) {

        if (id == null) return null;

        for (CustomerType c : CustomerType.values()) {
            if (id.equals(c.getId())) return c;
        }

        throw new IllegalAccessException("Invalid Id: " + id);
    }
}
