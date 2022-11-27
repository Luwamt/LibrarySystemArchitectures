package edu.miu.cs590.customerservice.service.Impl;
import edu.miu.cs590.customerservice.dto.BookAdapter;
import edu.miu.cs590.customerservice.dto.BookAddEventDto;
import edu.miu.cs590.customerservice.dto.BookDto;
import edu.miu.cs590.customerservice.model.Book;
import edu.miu.cs590.customerservice.repository.BookRepository;
import edu.miu.cs590.customerservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class BookImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public BookDto getBookById(Integer isbn) {
        Optional<Book> optional = bookRepository.findById(isbn);
        if (optional.isPresent()) {
            Book book = optional.get();
            return BookAdapter.toBookDto(book);
        }
        return null;
    }

    @Override
    public void saveBook(@RequestBody BookDto bookDto) {
        Book book = BookAdapter.fromBookDto(bookDto);
        System.out.println("From DTO:" + bookDto);
        System.out.println("From:" + book);
        bookRepository.insert(book);
    }

    @Override
    public void deleteBookById(Integer isbn) {
        bookRepository.deleteById(isbn);
    }

    @Override
    public void updateBook(Integer isbn, BookDto bookDto) {
        Optional<Book> update = bookRepository.findById(isbn);
        if (update.isPresent()) {
            Book book = BookAdapter.fromBookDto(bookDto);
            bookRepository.save(book);
        }

    }

}

