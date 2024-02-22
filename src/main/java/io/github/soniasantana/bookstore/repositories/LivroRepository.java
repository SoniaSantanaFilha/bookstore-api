package io.github.soniasantana.bookstore.repositories;

import io.github.soniasantana.bookstore.domain.Categoria;
import io.github.soniasantana.bookstore.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
