package edu.miu.cs590.customerservice.service.Impl;
import edu.miu.cs590.customerservice.dto.CustomerAdapter;
import edu.miu.cs590.customerservice.dto.CustomerAddEventDto;
import edu.miu.cs590.customerservice.dto.CustomerDto;
import edu.miu.cs590.customerservice.integration.Sender;
import edu.miu.cs590.customerservice.model.Customer;
import edu.miu.cs590.customerservice.repository.CustomerRepository;
import edu.miu.cs590.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

@Autowired
    Sender sender;
    @Override
    public void saveCustomer(CustomerDto customerDto) {
       Customer customer= CustomerAdapter.fromCustomerDto(customerDto);
        System.out.println("From DTO:"+ customerDto);
        System.out.println("From:"+ customer);
        customerRepository.save(customer);

    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(Integer customerNumber) {
          return customerRepository.findById(customerNumber).orElse(null);

    }

    @Override
    public void deleteCustomer(Integer customerNumber) {
        customerRepository.deleteById(customerNumber);
    }

    @Override
    public void updateCustomer(Integer customerNumber, CustomerDto customerDto) {
        Optional<Customer> update = customerRepository.findById(customerNumber);
        if (update.isPresent()) {
            Customer customer = CustomerAdapter.fromCustomerDto(customerDto);
            customerRepository.save(customer);
            var customerEvent= new CustomerAddEventDto("customer update his Nubmer",customerDto);
            sender.send(customerEvent);

        }
    }
    }

