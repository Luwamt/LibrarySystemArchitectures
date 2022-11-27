package edu.miu.cs590.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookAddEventDto {
   // private Integer isbn;
    private String change;
    private BookDto bookDto;

}
