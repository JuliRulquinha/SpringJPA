package com.SpringJPACourse.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Course {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
            name= "authors_courses",
            joinColumns = {
                    @JoinColumn( name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn( name = "author-id")
            }
    )
    private List<Author> authors;
}
