package edu.miu.cs590.customerservice.dto;


import edu.miu.cs590.customerservice.model.Book;

public class BookAdapter {

    public static Book fromBookDto(BookDto dto){
        return new Book(dto.getIsbn(), dto.getTitle(),
                dto.getDescription(),
                dto.getAuthorName(),dto.getReviews());
    }
    public static BookDto toBookDto(Book book){
        return new BookDto(book.getIsbn(), book.getTitle(),
                book.getDescription(),
                book.getAuthorName(),book.getReviews());
    }
}
