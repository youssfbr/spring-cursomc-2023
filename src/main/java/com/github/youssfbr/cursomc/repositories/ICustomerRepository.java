package com.github.youssfbr.cursomc.repositories;

import com.github.youssfbr.cursomc.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
