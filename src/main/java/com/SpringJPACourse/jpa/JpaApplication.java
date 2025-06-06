package com.SpringJPACourse.jpa;

import com.SpringJPACourse.jpa.entities.Author;
import com.SpringJPACourse.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	){
		return args -> {
			var author = Author.builder()
					.firstName("Juli")
					.lastName("Félix")
					.age(24)
					.email("juli@email.com")
					.build();
			repository.save(author);
		};
	}
}
