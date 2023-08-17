package biblioteca;

public class Usuario {

	//atributos da classe
	private String nome;
	private String email;
	private int ra;
	private boolean usuarioStatus;
					
	//construtor da classe
	public Usuario(String nome, String email, int ra) {
		this.nome = nome;
		this.email = email;
		this.ra = ra;
		
		//true = Não há pendencias 	FAZER UM ENUM
		//false = Há pendências
		
		//Utilizado posteriormente para alterar de acordo com os  empréstimos e possíveis mutas
		this.usuarioStatus = true;
	}
	

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
	
	
	//Utilizado posteriormente para alterar de acordo com os  empréstimos e possíveis mutas
	
	public boolean getUsuarioStatus() {
		return usuarioStatus;
	}
	
	public void setUsuarioStatus(boolean novoStatus) {
		this.usuarioStatus = novoStatus;
	}
}
