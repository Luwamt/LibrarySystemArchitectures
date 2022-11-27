package edu.miu.cs590.customerservice.web;

import edu.miu.cs590.customerservice.dto.CustomerDto;
import edu.miu.cs590.customerservice.model.Customer;
import edu.miu.cs590.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/customers"})
public class CustomerController {

    @Autowired
    public CustomerService customerService;

@PostMapping(value = {"/post"})
public ResponseEntity<CustomerDto> saveNewCustomer(@RequestBody CustomerDto customerDto){
    customerService.saveCustomer(customerDto);
   return new ResponseEntity<>( customerDto, HttpStatus.OK);
}
@GetMapping(value = {"/get/{customerNumber}"})
    public ResponseEntity<?> getCustomerById(@PathVariable Integer customerNumber){
    customerService.getCustomer(customerNumber);
    return  new ResponseEntity<>(customerNumber,HttpStatus.OK);
}
    @GetMapping(value = {"/list"})
    public ResponseEntity<List<Customer>> getCustomerById(){
        return  new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
    }
    @PutMapping(value = {"/update/{customerNumber}"})
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable Integer customerNumber, @RequestBody CustomerDto customerDto){
     customerService.updateCustomer(customerNumber,customerDto);
    return  new ResponseEntity<>(customerDto,HttpStatus.OK);
    }
    @DeleteMapping(value = {"/delete/{customerNumber}"})
    public ResponseEntity<Void> deleteCustomer(@PathVariable Integer customerNumber){
   customerService.deleteCustomer(customerNumber);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
