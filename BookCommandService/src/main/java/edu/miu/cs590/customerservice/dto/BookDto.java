package edu.miu.cs590.customerservice.dto;


import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDto {
    private Integer isbn;
    private  String title;
    private  String description;
    private  String authorName;
}
