package br.com.minhabiblioteca.repository;

import br.com.minhabiblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepositorio extends JpaRepository<Livro, Long> {
}