package edu.miu.cs590.customerservice.service;


import edu.miu.cs590.customerservice.dto.BookAddEventDto;
import edu.miu.cs590.customerservice.dto.BorrowingsDto;
import edu.miu.cs590.customerservice.dto.CustomerAddEventDto;
import edu.miu.cs590.customerservice.dto.CustomerDto;
import edu.miu.cs590.customerservice.model.Borrowings;
import edu.miu.cs590.customerservice.model.Customer;

import java.util.List;

public interface BorrowingsService {

    public void addBorrowings(BorrowingsDto borrowingsDto);
    List<Borrowings> getAllBorrowings();

    Borrowings getBorrowingById(Integer borrowingsNumber);
    void deleteBorrowing(Integer borrowingsNumber);
    void updateBorrowing(Integer borrowingsNumber, BorrowingsDto borrowingsDto);

    void updateBook(BookAddEventDto bookAddEventDto);
    void updateCustomer(CustomerAddEventDto customerAddEventDto);
}
