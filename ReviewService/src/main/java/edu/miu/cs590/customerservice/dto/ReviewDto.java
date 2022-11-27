package edu.miu.cs590.customerservice.dto;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReviewDto {
    private Integer isbn;
    private  Integer rating;
    private  String customerName;
    private  String description;
}
