package membro;

public class Administrador {
	
	private Funcionario dadosFuncionarioAdministrador;
	
	public Administrador(Funcionario dados) {
		this.dadosFuncionarioAdministrador = dados;
	}

	public Funcionario getDadosFuncionarioAdministrador() {
		return dadosFuncionarioAdministrador;
	}

	public void setDadosFuncionarioAdministrador(Funcionario dadosFuncionarioAdministrador) {
		this.dadosFuncionarioAdministrador = dadosFuncionarioAdministrador;
	}
}
