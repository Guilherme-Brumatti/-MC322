package membro;

public class Funcionario {

	private Membro informacoes;
	
	public Funcionario(Membro informacoes) {
		this.informacoes = informacoes;
	}
	
	public Membro getInformacoes() {
		return this.informacoes;
	}
	
	public void setInformacoes(Membro informacoes) {
		this.informacoes = informacoes;
	}
}
