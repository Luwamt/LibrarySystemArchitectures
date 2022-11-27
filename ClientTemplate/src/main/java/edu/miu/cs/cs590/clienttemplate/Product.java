package edu.miu.cs.cs590.clienttemplate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Product {
    private Integer productNumber;
    private String description;
    private double price;



    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
