package com.SpringJPACourse.jpa;

import com.SpringJPACourse.jpa.entities.Author;
import com.SpringJPACourse.jpa.entities.Video;
import com.SpringJPACourse.jpa.repositories.AuthorRepository;
import com.SpringJPACourse.jpa.repositories.VideoRepository;
import com.github.javafaker.Faker;
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
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	){
		return args -> {
			for( int i = 0; i < 50; i++){
				Faker faker = new Faker();

			var author = Author.builder()
					.firstName(faker.name().firstName())
					.lastName(faker.name().lastName())
					.age(faker.number().numberBetween(19, 50))
					.email(faker.name().username()+"@email.com")
					.build();
			authorRepository.save(author);
		}
			// Update Author with ID = 1

//			var author = Author.builder()
//					.id(1)
//					.firstName("Juli")
//					.lastName("Félix")
//					.age(24)
//					.email("juli@email.com")
//					.build();
//			authorRepository.save(author);

			// Update Author a set a.age = 22 where a.id = 1

			//authorRepository.updateAuthorAge(22,1);


			//authorRepository.updateAllAuthorsAges(99);

			//authorRepository.findByNamedQuery(24)
//					.forEach(author -> {
//						System.out.println(author.getAge());
//					});

			authorRepository.updateByNamedQuery(99);

			/*var video = Video.builder()
					.name("abc")
					.length(6)
					.build();

			videoRepository.save(video);*/
		};
	}
}
