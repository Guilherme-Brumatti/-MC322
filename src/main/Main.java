package main;

import biblioteca.Biblioteca;
import biblioteca.Livro;
import biblioteca.Usuario;

public class Main {

	public static void main(String[] args) {
		
        Biblioteca biblioteca = new Biblioteca(5);
        
        Livro livroUm = new Livro("Paulinho em Nárnia", "Se eu te conta", "Logo ele", "Mistério");
        Livro livroDois = new Livro("O Hobbit", "WMF Martins Fontes", "J.R.R. Tolkien", "Fantasia");
        Livro livroTres = new Livro("Harry Potter e as Relíquias da Morte", "Rocco", "J.K. Rowling", "F");
        Livro livroQuatro = new Livro("O Senhor dos Aneis", "WMF Martins Fontes", "J.R.R. Tolkien", "Fantasia");
        
        biblioteca.addLivro(livroUm);
        biblioteca.addLivro(livroDois);
        biblioteca.addLivro(livroTres);
        biblioteca.addLivro(livroQuatro);
        
        biblioteca.listaLivros();
        
        
        Usuario usuarioUm = new Usuario("Linguini", "salsa@gmail.com", 217802);
        
        Usuario usuarioDois = new Usuario("Cenoura", "tangeras@gmail.com", 123456);
        
        
        biblioteca.alugaLivro(usuarioUm, livroUm);
        
        biblioteca.alugaLivro(usuarioDois, livroUm);
        
        biblioteca.devolveLivro(usuarioUm, livroUm);
        
        
	}

}