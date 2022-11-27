package edu.miu.cs590.customerservice.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Review {
    private Integer isbn;
    private  Integer rating;


}
