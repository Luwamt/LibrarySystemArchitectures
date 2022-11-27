package edu.miu.cs590.customerservice.service;


import edu.miu.cs590.customerservice.dto.BookAddEventDto;
import edu.miu.cs590.customerservice.dto.BookDto;
import edu.miu.cs590.customerservice.model.Book;

import java.util.List;


public interface BookService {

    List<Book> getAllBooks();
    BookDto getBookById(Integer isbn);
    public void saveBook(BookDto bookDto);
    void deleteBookById(Integer isbn);
    void updateBook(Integer isbn, BookDto bookDto);

}
