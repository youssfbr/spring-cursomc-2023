package com.github.youssfbr.cursomc.entities.enums;

import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public enum CustomerType {

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int id;
    private String descricao;

    private CustomerType(int id , String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @SneakyThrows
    public  static CustomerType toEnum(Integer id) {

        if (id == null) return null;

        for (CustomerType c : CustomerType.values()) {
            if (id.equals(c.getId())) return c;
        }

        throw new IllegalAccessException("Invalid Id: " + id);
    }
}
