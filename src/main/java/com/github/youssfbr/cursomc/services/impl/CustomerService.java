package com.github.youssfbr.cursomc.services.impl;

import com.github.youssfbr.cursomc.dtos.CustomerResponseDTO;
import com.github.youssfbr.cursomc.repositories.ICustomerRepository;
import com.github.youssfbr.cursomc.services.ICustomerService;
import com.github.youssfbr.cursomc.services.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {

    private final ICustomerRepository customerRepository;
    private static final String NOT_FOUND_MESSAGE = "Resource not found with id ";


    @Override
    @Transactional(readOnly = true)
    public CustomerResponseDTO findById(Long id) {
        return customerRepository.findById(id)
                .map(CustomerResponseDTO::new)
                .orElseThrow(() -> new ResourceNotFoundException(NOT_FOUND_MESSAGE + id));
    }
}
