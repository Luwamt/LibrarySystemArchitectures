package edu.miu.cs590.customerservice.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Document
@ToString
public class Book {
    @Id
    private Integer isbn;
    private  String title;
    private  String description;
    private  String authorName;
    private List<Review> reviews;
}
