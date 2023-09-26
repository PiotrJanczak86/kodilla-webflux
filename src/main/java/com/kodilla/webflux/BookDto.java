package com.kodilla.webflux;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BookDto {
    private String title;
    private String author;
    private int year;
}