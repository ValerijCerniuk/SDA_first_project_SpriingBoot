package com.sdaProject.controller;

import java.util.List;
import javax.validation.Valid;

import com.sdaProject.entity.Customer;
import com.sdaProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {


    @Autowired private CustomerService customerService;

    // Save operation
    @PostMapping("/customers")
    public Customer saveCustomer(
            @Valid @RequestBody Customer customer)
    {
        return customerService.saveCustomer(customer);
    }

    // Read operation
    @GetMapping("/customers")
    public List<Customer> fetchCustomerList()
    {
        return customerService.fetchCustomerList();
    }

    // Update operation
    @PutMapping("/customers/{id}")
    public Customer
    updateCustomer(@RequestBody Customer customer,
                     @PathVariable("id") Integer customerId)
    {
        return customerService.updateCustomer(
                customer, customerId);
    }

    // Delete operation
    @DeleteMapping("/customers/{id}")
    public String deleteCustomerById(@PathVariable("id")
                                       Integer customerId)
    {
        customerService.deleteCustomerById(
                customerId);
        return "Deleted Successfully";
    }
}