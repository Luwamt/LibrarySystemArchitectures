package edu.miu.cs.cs590.clienttemplate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Supplier {

    private int supplierNumber;
    private String name;
    private String phone;
    private String  email;

}
