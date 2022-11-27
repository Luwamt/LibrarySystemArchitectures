package edu.miu.cs590.customerservice.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Document
@ToString
public class Borrowings {
    @Id
    private Integer borrowingNumber;
    private LocalDate date;
    private Customer customer;
    private Book book;
}
