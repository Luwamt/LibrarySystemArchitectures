package edu.miu.cs590.customerservice.service;


import edu.miu.cs590.customerservice.dto.CustomerDto;
import edu.miu.cs590.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {

    public void saveCustomer(CustomerDto customerDto);
    List<Customer> getAllCustomers();
    Customer getCustomer(Integer customerNumber);
    void deleteCustomer(Integer customerNumber);
    void updateCustomer(Integer customerNumber, CustomerDto customerDto);
}
