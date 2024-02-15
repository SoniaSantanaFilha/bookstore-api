package io.github.soniasantana.bookstore;

import io.github.soniasantana.bookstore.domain.Categoria;
import io.github.soniasantana.bookstore.domain.Livro;
import io.github.soniasantana.bookstore.repositories.CategoriaRepository;
import io.github.soniasantana.bookstore.repositories.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication{

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

}
