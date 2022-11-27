package edu.miu.cs590.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BorrowingsAddEventDto {
    private String change;
    private BorrowingsDto borrowingsDto;

}
