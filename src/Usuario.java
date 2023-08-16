package biblioteca;

public class Usuario {

	//atributos da classe
	private String nome;
	private String email;
	private int ra;
	private boolean status;
					
	//construtor da classe
	public Usuario(String nome, String email, int ra) {
		this.nome = nome;
		this.email = email;
		this.ra = ra;
		System.out.println("TETYYEY");
		// AGSADAAARA
		//true = Não há pendencias
		//false = Há pendências
		this.status = true;
	}
	
	//Metodos da classe
	
	
	//Getters para acessar os atributos privado
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getRa() {
		return ra;
	}
	
	public boolean getStatus() {
		return status;
	}
	
}
