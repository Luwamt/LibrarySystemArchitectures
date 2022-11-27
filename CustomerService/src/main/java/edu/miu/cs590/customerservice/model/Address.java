package edu.miu.cs590.customerservice.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    private  String street;
    private String city;
    private  Integer zip;
}
