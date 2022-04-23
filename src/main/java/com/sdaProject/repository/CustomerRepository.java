package com.sdaProject.repository;


import com.sdaProject.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {
}
