package biblioteca;

import item.LivroFisico;
import membro.EstudanteGraduacao;

public class Biblioteca {
	private LivroFisico[] livros;
	private int livroCount;

	
	public Biblioteca(int maxLivros) {
		
			livros = new LivroFisico[maxLivros];
			livroCount = 0;
		// TODO Auto-generated constructor stub
	}

	public void addLivro(LivroFisico livro) {
		if(livroCount < livros.length) {
			livros[livroCount] = livro;
			livroCount++;
			System.out.println("Livro adicionado a biblioteca: " + livro.getDados().getNome());
		} else {
			System.out.println("A biblioteca esta cheia, não é possível adicionar mais livros.");
		}
	}
	
	public void listaLivros() {
		System.out.println("Livros na biblioteca:");
		for(int i = 0; i < livroCount; i++) {
			System.out.println(livros[i].getDados().getNome() + " (" + livros[i].getDados().getAssunto() + "), Autor: "
			+ livros[i].getDados().getAutor() + ". Editora: " + livros[i].getDados().getEditora() + ". Status: " + 
			livros[i].getDados().getLivroStatus());
		}
	}
	
	public void alugaLivro(EstudanteGraduacao aluno, LivroFisico livro){
	    if(livro.getDados().getLivroStatus() == true){
	    	livro.getDados().setLivroStatus(false);
	        System.out.println("O usuário " + aluno.getInformacoes().getNome() + " alugou o livro" + livro.getDados().getNome() + " !");
	        
	        //Construir uma forma de temporizar uma retirada de livro, mas ainda assim sem fazer uma interrupção no proprio  código !!
	        
	        //	IDEIA: fazer uma marcação na hora em que o livro e fazer uma  lista composta por livros já alugados e 
	        //			fazer uma comparação  com a hora atual.
	        //			
	        //			POTENCIAL DE EXPANSÃO: utilizar um contador negativo para dias em atraso e penalização distintas

	    }
	    else{
	        System.out.println("O livro " + livro.getDados().getNome() +  " já está alugado :(");
	    }
	}
	
    public void devolveLivro(EstudanteGraduacao aluno, LivroFisico livro){
	    if(livro.getDados().getLivroStatus() == false){
	    	livro.getDados().setLivroStatus(true);
	        System.out.println("O usuário " + aluno.getInformacoes().getNome() + " devolveu o livro " + livro.getDados().getNome() + " !");
	    }
	    else{
	        System.out.println("O livro " + livro.getDados().getNome() +   " não foi alugado !");
	    }
	}
    
  
    
}