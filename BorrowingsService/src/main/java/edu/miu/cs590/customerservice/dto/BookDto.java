package edu.miu.cs590.customerservice.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class BookDto {
    private Integer isbn;
    private  String title;


}
