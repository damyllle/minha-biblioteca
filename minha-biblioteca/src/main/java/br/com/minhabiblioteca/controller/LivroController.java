package br.com.minhabiblioteca.controller;

import br.com.minhabiblioteca.model.Livro;
import br.com.minhabiblioteca.repository.LivroRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livros")
@CrossOrigin(origins = "*")
public class LivroController {

    private LivroRepositorio livroRepositorio;
    List<Livro> lista = new ArrayList<>();

    public LivroController(LivroRepositorio LivroRepositorio) {
        this.livroRepositorio = LivroRepositorio;
    }
    @GetMapping
    public List<Livro> listarLivros(){
        return livroRepositorio.findAll();
    }
}
