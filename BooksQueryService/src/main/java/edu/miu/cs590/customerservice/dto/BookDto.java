package edu.miu.cs590.customerservice.dto;


import edu.miu.cs590.customerservice.model.Review;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDto {
    private Integer isbn;
    private  String title;
    private  String description;
    private  String authorName;
    private List<Review> reviews;
}

