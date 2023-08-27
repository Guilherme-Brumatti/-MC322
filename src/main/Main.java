package main;

import biblioteca.Biblioteca;
import biblioteca.Emprestimo;
import biblioteca.Item;
import item.LivroFisico;
import membro.EstudanteGraduacao;
import membro.Membro;

public class Main {

	public static void main(String[] args) {
		
        Biblioteca biblioteca = new Biblioteca(5);
        
        LivroFisico livroFisicoUm = new LivroFisico(new Item("Paulinho em Nárnia", "Se eu te conta", "Logo ele", "Mistério"));
        LivroFisico livroFisicoDois = new LivroFisico(new Item("O Hobbit", "WMF Martins Fontes", "J.R.R. Tolkien", "Fantasia"));
        LivroFisico livroFisicoTres = new LivroFisico(new Item("Harry Potter e as Relíquias da Morte", "Rocco", "J.K. Rowling", "F"));
        LivroFisico livroFisicoQuatro = new LivroFisico(new Item("O Senhor dos Aneis", "WMF Martins Fontes", "J.R.R. Tolkien", "Fantasia"));
        
        biblioteca.addLivro(livroFisicoUm);
        biblioteca.addLivro(livroFisicoDois);
        biblioteca.addLivro(livroFisicoTres);
        biblioteca.addLivro(livroFisicoQuatro);
        
        biblioteca.listaLivros();
        
        Emprestimo[] Emprestimos = new Emprestimo[10];
        
        EstudanteGraduacao usuarioUm = new EstudanteGraduacao(new Membro("Linguini", "salsa@gmail.com", 217802, Emprestimos));
        
        EstudanteGraduacao usuarioDois = new EstudanteGraduacao(new Membro("Cenoura", "tangeras@gmail.com", 123456, Emprestimos));
        
        
        biblioteca.alugaLivro(usuarioUm, livroFisicoUm);
        
        biblioteca.alugaLivro(usuarioDois, livroFisicoDois);
        
        biblioteca.devolveLivro(usuarioUm, livroFisicoTres);
        
        
	}

}