package edu.miu.cs590.customerservice.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Document
@ToString
public class Customer {
    @Id
    private Integer customerNumber;
    private  String name;
    private Contact contact;
    private Address address;
}
