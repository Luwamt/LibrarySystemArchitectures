package edu.miu.cs590.customerservice.dto;


import edu.miu.cs590.customerservice.model.Address;
import edu.miu.cs590.customerservice.model.Contact;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {
    private Integer customerNumber;
    private  String name;
    private Contact contact;
    private Address address;
}
