package edu.miu.cs590.customerservice.web;
import edu.miu.cs590.customerservice.dto.BookDto;
import edu.miu.cs590.customerservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/books"})
public class BookController {

    @Autowired
    public BookService bookService;

@PostMapping(value = {"/post"})
public ResponseEntity<BookDto> saveNewBook(@RequestBody BookDto bookDto){
    bookService.saveBook(bookDto);
   return new ResponseEntity<>( bookDto, HttpStatus.OK);
}
    @PutMapping(value = {"/update/{isbn}"})
    public ResponseEntity<BookDto> updateCustomer(@PathVariable Integer isbn, @RequestBody BookDto bookDto){
        bookService.updateBook(isbn,bookDto);
    return  new ResponseEntity<>(bookDto,HttpStatus.OK);
    }
    @DeleteMapping(value = {"/delete/{customerNumber}"})
    public ResponseEntity<Void> deleteCustomer(@PathVariable Integer isbn){
        bookService.deleteBookById(isbn);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

//    @GetMapping(value = {"/get/{customerNumber}"})
//    public ResponseEntity<?> getCustomerById(@PathVariable Integer customerNumber){
//        customerService.getCustomer(customerNumber);
//        return  new ResponseEntity<>(customerNumber,HttpStatus.OK);
//    }
//    @GetMapping(value = {"/list"})
//    public ResponseEntity<List<Customer>> getCustomerById(){
//        return  new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
//    }
