package membro;

public class Atendente {
	
	private Funcionario dadosFuncionarioAtendente;
	
	public Atendente(Funcionario dadosFuncionarioAtendente) {
		this.dadosFuncionarioAtendente = dadosFuncionarioAtendente;
	}

	public Funcionario getDadosFuncionarioAtendente() {
		return dadosFuncionarioAtendente;
	}

	public void setDadosFuncionarioAtendente(Funcionario dadosFuncionarioAtendente) {
		this.dadosFuncionarioAtendente = dadosFuncionarioAtendente;
	}
}
