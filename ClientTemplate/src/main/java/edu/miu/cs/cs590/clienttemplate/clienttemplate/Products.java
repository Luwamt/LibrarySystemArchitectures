package edu.miu.cs.cs590.clienttemplate.clienttemplate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
public class Products {

    private Collection<Product> books = new ArrayList<>();

    @Override
    public String toString() {
        return "Products{" +
                "books=" + books +
                '}';
    }
}
