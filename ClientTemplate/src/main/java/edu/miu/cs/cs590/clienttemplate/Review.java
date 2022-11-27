package edu.miu.cs.cs590.clienttemplate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Review {

    private String title;
    private String description;
    private int score;
}
