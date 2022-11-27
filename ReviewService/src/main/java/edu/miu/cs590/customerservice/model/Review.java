package edu.miu.cs590.customerservice.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Document
@ToString
public class Review {
    @Id
    private Integer isbn;
    private  Integer rating;
    private  String customerName;
    private  String description;

}
