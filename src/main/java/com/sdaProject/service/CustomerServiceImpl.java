package com.sdaProject.service;

// Importing required classes
import java.util.List;
import java.util.Objects;

import com.sdaProject.entity.Customer;
import com.sdaProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl
        implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Save operation
    @Override
    public Customer saveCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }

    // Read operation
    @Override public List<Customer> fetchCustomerList()
    {
        return (List<Customer>)
                customerRepository.findAll();
    }

    // Update operation
    @Override
    public Customer
    updateCustomer(Customer customer,
                     Integer customerId)
    {
        Customer customerDB
                = customerRepository.findById(customerId)
                .get();

        if (Objects.nonNull(customer.getFullName())
                && !"".equalsIgnoreCase(
                customer.getFullName())) {
            customerDB.setFullName(
                    customer.getFullName());
        }

        if (Objects.nonNull(
                customer.getEmail())
                && !"".equalsIgnoreCase(
                customer.getEmail())) {
            customerDB.setEmail(
                    customer.getEmail());
        }

        if (Objects.nonNull(customer.getPhoneNumber())
                && !"".equalsIgnoreCase(
                customer.getPhoneNumber())) {
            customerDB.setPhoneNumber(
                    customer.getPhoneNumber());
        }

        if (Objects.nonNull(customer.getBillingAddress())
                && !"".equalsIgnoreCase(
                customer.getBillingAddress())) {
            customerDB.setBillingAddress(
                    customer.getBillingAddress());
        }

        return customerRepository.save(customerDB);
    }

    // Delete operation
    @Override
    public void deleteCustomerById(Integer customerId)
    {
        customerRepository.deleteById(customerId);
    }
}