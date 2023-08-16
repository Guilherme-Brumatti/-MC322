package biblioteca;

public class Livro {
	
	//atributos da classe
	private String nome;
	private String editora;
	private String autor;
	private String assunto;
	
	//atributo privado sem getter
	private boolean livroStatus;
	
	//construtor da classe
	public Livro(String nome, String editora, String autor, String assunto) {
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.assunto = assunto;
		//inicializa disponível
		this.livroStatus = true;
	}
	
	//Metodos da classe
	
	
	//Getters para acessar os atributos privado
	public String getNome() {
		return nome;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getAssunto() {
		return assunto;
	}
	
}