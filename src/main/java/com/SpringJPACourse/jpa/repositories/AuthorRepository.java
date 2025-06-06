package com.SpringJPACourse.jpa.repositories;

import com.SpringJPACourse.jpa.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
