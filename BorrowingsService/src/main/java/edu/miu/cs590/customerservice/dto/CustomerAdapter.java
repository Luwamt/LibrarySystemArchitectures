package edu.miu.cs590.customerservice.dto;


import edu.miu.cs590.customerservice.model.Borrowings;
import edu.miu.cs590.customerservice.model.Customer;


public class CustomerAdapter {

    public static Customer fromCustomerDto(CustomerDto dto){
        return new Customer(dto.getCustomerNumber(),dto.getName());
    }
    public static CustomerDto toCustomersDto(Customer customer){
        return new CustomerDto(customer.getCustomerNumber(),customer.getName());
    }
}
