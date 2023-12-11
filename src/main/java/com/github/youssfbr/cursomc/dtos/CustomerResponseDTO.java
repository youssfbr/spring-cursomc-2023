package com.github.youssfbr.cursomc.dtos;

import com.github.youssfbr.cursomc.entities.Customer;

import java.util.List;
import java.util.Set;

public record CustomerResponseDTO(
        Long id ,
        String name ,
        String email ,
        String type ,
        String cpfOrCnpj ,
        Set<String> phones ,
        List<AddressResponseDTO> addresses
) {
    public CustomerResponseDTO(Customer customer) {
        this(
                customer.getId() ,
                customer.getName() ,
                customer.getEmail() ,
                customer.getCustomerType().getDescricao(),
                customer.getCpfOrCnpj() ,
                customer.getPhones() ,
                customer.getAddresses().stream()
                     .map(AddressResponseDTO::new)
                     .toList()
        );
    }
}
