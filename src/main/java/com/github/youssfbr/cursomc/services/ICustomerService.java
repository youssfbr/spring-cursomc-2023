package com.github.youssfbr.cursomc.services;

import com.github.youssfbr.cursomc.dtos.CustomerResponseDTO;

public interface ICustomerService {
    CustomerResponseDTO findById(Long id);
}
