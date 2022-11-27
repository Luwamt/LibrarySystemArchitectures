package edu.miu.cs590.customerservice.dto;


import edu.miu.cs590.customerservice.model.Customer;

public class CustomerAdapter {

    public static Customer fromCustomerDto(CustomerDto dto){
        return new Customer(dto.getCustomerNumber(), dto.getName(),
                dto.getContact(), dto.getAddress() );
    }
    public static CustomerDto toCustomerDto(Customer customer){
        return new CustomerDto(customer.getCustomerNumber(), customer.getName(),
                customer.getContact(), customer.getAddress() );
    }
}
