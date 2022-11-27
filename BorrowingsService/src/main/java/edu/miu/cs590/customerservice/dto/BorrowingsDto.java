package edu.miu.cs590.customerservice.dto;


import edu.miu.cs590.customerservice.model.Book;
import edu.miu.cs590.customerservice.model.Customer;
import lombok.*;


import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BorrowingsDto {
    private Integer borrowingNumber;
    private LocalDate date;
    private Customer customer;
    private Book book;
}
