package main;

import biblioteca.Biblioteca;
import biblioteca.Livro;
import biblioteca.Usuário;

public class Main {

	public static void main(String[] args) {
		
        Biblioteca biblioteca = new Biblioteca(5);
        
        Livro livroUm = new Livro("Paulinho em Nárnia", "Se eu te conta", "Fé", "Mistério");
        
        Usuario usuarioUm = new Usuario("Linguini", "salsa@gmail.com", "217802");
        
        biblioteca.addLivro(livroUm);
        
        biblioteca.listaLivros();
        
        biblioteca.alugaLivro(usuarioUm, livroUm);
        
        biblioteca.devolveLivro(usuarioUm, livroUm);
        
        
	}

}