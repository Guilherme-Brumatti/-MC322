package membro;

public class Professores {

	private Membro informacoes;
	
	public Professores(Membro informacoes) {
		this.informacoes = informacoes;
	}
	
	public Membro getInformacoes() {
		return this.informacoes;
	}
	
	public void setInformacoes(Membro informacoes) {
		this.informacoes = informacoes;
	}
}
