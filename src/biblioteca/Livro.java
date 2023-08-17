package biblioteca;

public class Livro {
	
	//atributos da classe
	private String nome;
	private String editora;
	private String autor;
	private String assunto;
	private boolean livroStatus;
	private int livroTimer;
	
	//construtor da classe
	public Livro(String nome, String editora, String autor, String assunto) {
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.assunto = assunto;
		
		//inicializa disponível e timer máximo
		this.livroStatus = true;
		this.livroTimer = 100;
	}
	
	
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
	public boolean getLivroStatus() {
		return livroStatus;
	}
	
	public int getLivroTimer() {
		return livroTimer;
	}
	
	public void setLivroStatus(boolean novoStatus) {
		this.livroStatus = novoStatus;
	}
	
	public void setLivroTimer(int novoTimer) {
		this.livroTimer = novoTimer; 
	}
	
}