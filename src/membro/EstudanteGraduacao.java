package membro;

public class EstudanteGraduacao {
	
	//Utilizando Agregação
	private Membro informacoes;
	
	public EstudanteGraduacao(Membro informacoes) {
		this.informacoes = informacoes;
	}
	
	public Membro getInformacoes() {
		return this.informacoes;
	}
	
	public void setInformacoes(Membro informacoes) {
		this.informacoes = informacoes;
	}
}
