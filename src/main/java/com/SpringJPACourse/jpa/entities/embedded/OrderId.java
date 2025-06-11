package com.SpringJPACourse.jpa.entities.embedded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderId implements Serializable {

    @Embedded
    private Address address;
    private String userName;
    private LocalDateTime orderDate;
}
