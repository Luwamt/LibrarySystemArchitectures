package edu.miu.cs590.customerservice.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private Integer customerNumber;
    private  String name;
}
