package edu.miu.cs590.customerservice.service;


import edu.miu.cs590.customerservice.dto.BookDto;


public interface BookService {

    public void saveBook(BookDto bookDto);
    void deleteBookById(Integer isbn);
    void updateBook(Integer isbn, BookDto bookDto);
//    List<Book> getAllCustomers();
    //Book getBook(Integer isbn);
}
