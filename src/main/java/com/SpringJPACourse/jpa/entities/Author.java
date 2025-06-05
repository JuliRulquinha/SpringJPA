package com.SpringJPACourse.jpa.entities;

import lombok.*;

@Data
@NoArgsConstructor
public class Author {
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private int age;


}
