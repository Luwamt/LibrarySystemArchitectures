package edu.miu.cs590.customerservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CustomerAddEventDto {
    private String change;
    private CustomerDto customerDto;

}
