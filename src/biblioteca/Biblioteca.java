package biblioteca;

public class Biblioteca {
	private Livro[] livros;
	private int livroCount;

	
	public Biblioteca(int maxLivros) {
		
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
			System.out.println(livros[i].getNome() + " (" + livros[i].getAssunto() + "), Autor: "
			+ livros[i].getAutor() + ". Editora: " + livros[i].getEditora() + ". Status: " + 
			livros[i].getLivroStatus());
		}
	}
	
	public void alugaLivro(Usuario aluno, Livro livro){
	    if(livro.getLivroStatus() == true){
	    	livro.setLivroStatus(false);
	        System.out.println("O usuário " + aluno.getNome() + " alugou o livro" + livro.getNome() + " !");
	        
	        //Construir uma forma de temporizar uma retirada de livro, mas ainda assim sem fazer uma interrupção no proprio  código !!
	        
	        //	IDEIA: fazer uma marcação na hora em que o livro e fazer uma  lista composta por livros já alugados e 
	        //			fazer uma comparação  com a hora atual.
	        //			
	        //			POTENCIAL DE EXPANSÃO: utilizar um contador negativo para dias em atraso e penalização distintas

	    }
	    else{
	        System.out.println("O livro " + livro.getNome() +  " já está alugado :(");
	    }
	}
	
    public void devolveLivro(Usuario aluno, Livro livro){
	    if(livro.getLivroStatus() == false){
	    	livro.setLivroStatus(true);
	        System.out.println("O usuário " + aluno.getNome() + " devolveu o livro " + livro.getNome() + " !");
	    }
	    else{
	        System.out.println("O livro " + livro.getNome() +   " não foi alugado !");
	    }
	}
    
  
    
}