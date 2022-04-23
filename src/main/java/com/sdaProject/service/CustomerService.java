package com.sdaProject.service;


import com.sdaProject.entity.Customer;

import java.util.List;


public interface CustomerService {

    // Save operation
    Customer saveCustomer(Customer customer);

    // Read operation
    List<Customer> fetchCustomerList();

    // Update operation
    Customer updateCustomer(Customer customer,
                                Integer customerId);

    // Delete operation
    void deleteCustomerById(Integer customerId);
}