package membro;

import biblioteca.Emprestimo;

public class Membro {

	//atributos da classe
	private String nome;
	private String email;
	private int ra;
	private boolean usuarioStatus;
	
	//Utilizano Associação 
	private Emprestimo[] emprestimos;
					
	//construtor da classe
	public Membro(String nome, String email, int ra, Emprestimo[] emprestimos) {
		this.nome = nome;
		this.email = email;
		this.ra = ra;
		
		//true = Não há pendencias 	FAZER UM ENUM
		//false = Há pendências
		
		//Utilizado posteriormente para alterar de acordo com os  empréstimos e possíveis mutas
		this.usuarioStatus = true;
		this.emprestimos = emprestimos;
	}
	
	// Metodos
	
	public void Reserva() {
		
		// Realiza a opera��o de reserva
		// Talvez adiciona um novo item na lista de emprestimos
		
	}
	

	//Getters para acessar os atributos privado
	public Emprestimo[] getEmprestimos() {
		return this.emprestimos;
	}
	
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimos[this.emprestimos.length + 1] = emprestimo;
	}
	
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
