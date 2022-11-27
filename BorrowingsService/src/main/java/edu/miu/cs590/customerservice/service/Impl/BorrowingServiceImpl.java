package edu.miu.cs590.customerservice.service.Impl;
import edu.miu.cs590.customerservice.dto.*;
import edu.miu.cs590.customerservice.model.Book;
import edu.miu.cs590.customerservice.model.Borrowings;
import edu.miu.cs590.customerservice.model.Customer;
import edu.miu.cs590.customerservice.repository.BorrowingsRepository;
import edu.miu.cs590.customerservice.service.BorrowingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowingServiceImpl implements BorrowingsService {

    @Autowired
    private BorrowingsRepository borrowingsRepository;


    @Override
    public void addBorrowings(BorrowingsDto borrowingsDto) {
        Borrowings borrowing = BorrowingsAdapter.fromBorrowingsDto(borrowingsDto);
        System.out.println("From Dto: " + borrowingsDto);
        System.out.println("From : " + borrowing);
        borrowingsRepository.save(borrowing);


    }

    @Override
    public void updateBorrowing(Integer borrowingsNumber, BorrowingsDto borrowingsDto) {
        Optional<Borrowings> optional = borrowingsRepository.findById(borrowingsNumber);
        if (optional.isPresent()) {
            Borrowings borrowing = BorrowingsAdapter.fromBorrowingsDto(borrowingsDto);
            borrowingsRepository.save(borrowing);
        }

    }

    @Override
    public void updateBook(BookAddEventDto bookAddEvent) {
        Optional<Borrowings> optional = borrowingsRepository.findById(bookAddEvent.getBookDto().getIsbn());
        if (optional.isPresent()) {
        optional.stream().map(borrow -> {
                    var book = new Book(bookAddEvent.getBookDto().getIsbn(),
                            bookAddEvent.getBookDto().getTitle());
                    borrow.setBook(book);
                    return borrow;
                }
        ).findFirst().orElse(null);
        optional.stream().map(add -> borrowingsRepository.save(add));
    }

}
    @Override
    public void updateCustomer(CustomerAddEventDto customerAddEvent) {
        Optional<Borrowings> optional = borrowingsRepository.findById(customerAddEvent.getCustomerDto().getCustomerNumber());
        if (optional.isPresent()) {
            optional.stream().map(change -> {
                        var customer = new Customer(customerAddEvent.getCustomerDto().getCustomerNumber(),
                                customerAddEvent.getCustomerDto().getName());
                change.setCustomer(customer);
                        return change;
                    }
            ).findFirst().orElse(null);
            optional.stream().map(add -> borrowingsRepository.save(add));
        }
    }

    @Override
    public List<Borrowings> getAllBorrowings() {
        return borrowingsRepository.findAll();
    }





    @Override
    public Borrowings getBorrowingById(Integer borrowingsNumber) {
        return borrowingsRepository.findById(borrowingsNumber).orElse(null);
    }

    @Override
    public void deleteBorrowing(Integer borrowingsNumber) {
  borrowingsRepository.deleteById(borrowingsNumber);

    }


}

