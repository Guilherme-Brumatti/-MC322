package biblioteca;

public class Biblioteca {
	private Livro[] livros;
	private int livroCount;

	
	public Biblioteca(int maxLivros) {]
		
			livros = new Livro[maxLivros];
			livroCount = 0;
		// TODO Auto-generated constructor stub
	}

	public void addLivro(Livro livro) {
		if(livroCount < livros.length) {
			livros[livroCount] = livro;
			livroCount++;
			System.out.println("Livro adicionado a biblioteca: " + livro.getNome());
		} else {
			System.out.println("A biblioteca esta cheia, não é possível adicionar mais livros.");
		}
	}
	
	public void listaLivros() {
		System.out.println("Livros na biblioteca:");
		for(int i = 0; i < livroCount; i++) {
			System.out.println(livros[i].getNome() + " (" + livros[i].assunto + "), Autor: "
			+ livros[i].autor + ". Editora: " + livros[i].editora + ". Status: " + 
			livros[i].livroStatus);
		}
	}
	
	public void alugaLivro(Usuario aluno, Livro livro){
	    if(livro.livroStatus == true){
	        livro.livroStatus == false;
	        System.out.printIn("O usuário" + aluno.nome "alugou o livro" + livro.nome "!");
	    }
	    else{
	        System.out.printIn("O livro" + livro.nome " já está alugado :(");
	    }
	}
	
    public void devolveLivro(Usuario aluno, Livro livro){
	    if(livro.livroStatus == false){
	        livro.livroStatus == true;
	        System.out.printIn("O usuário" + aluno.nome "devolveu o livro" + livro.nome "!");
	    }
	    else{
	        System.out.printIn("O livro" + livro.nome "não foi alugado !");
	    }
	}
}