package membro;

public class Funcionario extends Membro {
	
	public Funcionario(String nome, String email, int ra) {
		super(nome,email,ra);
		
		limiteEmprestimo = 4;
		prazoEmprestimo = 20;
		multaAtraso = 0.75;
						
	}
	
}
