package membro;

public class Gerente {
	
	private Funcionario dadosFuncionarioGerente;
	
	public Gerente(Funcionario dadosFuncionarioGerente) {
		this.dadosFuncionarioGerente = dadosFuncionarioGerente;
	}

	public Funcionario getDadosFuncionarioAtendente() {
		return dadosFuncionarioGerente;
	}

	public void getDadosFuncionarioAtendente(Funcionario dadosFuncionarioGerente) {
		this.dadosFuncionarioGerente = dadosFuncionarioGerente;
	}

}
