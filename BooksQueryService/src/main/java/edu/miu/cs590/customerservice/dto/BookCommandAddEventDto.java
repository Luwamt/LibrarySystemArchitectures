package edu.miu.cs590.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookCommandAddEventDto {
    private String change;
    private BookDto bookDto;

}
