package com.SpringJPACourse.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author {

    // * VALUE GENERATION FOR PRIMARY KEYS STRATEGIES *
    /*
     @GeneratedValue

     Using this annotation alone will result in Hibernate using AUTO by default,
     and it will choose the best strategy for each case.

    * SEQUENCE *

     @GeneratedValue(

        strategy = GenerationType.SEQUENCE,     - Specifies that JPA should use a database sequence

        generator = "author_sequence"   - Links to the sequence generator defined below
     )
     @SequenceGenerator(

        name = "author_sequence",       - The internal name used in JPA

        sequenceName = "author_sequence",       - The actual database sequence name

        allocationSize = 1      - Number of values to preallocate. Setting this to 1
                                  means every insert will fetch a new value from the
                                  database (less performant, but avoids gaps)
     )

    @GeneratedValue(
        strategy = GenerationType.TABLE,
        generator = "author_id_gen"
    )
    @TableGenerator(
        name = "author_id_gen",
        table = "id_generator",
        pkColumnName = "id name",
        valueColumnName = "id_value",
        allocationSize = 1
    )

    */

    @Id
    @GeneratedValue
    private Integer id;

    @Column( name = "f-name")
    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;


}
