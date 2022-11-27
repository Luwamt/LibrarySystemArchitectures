package edu.miu.cs590.customerservice.dto;


import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {
    private Integer customerNumber;
    private  String name;

}
