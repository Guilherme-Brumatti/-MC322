package membro;

public class Professores extends Membro {
	
	public Professores(String nome, String email, int ra) {
		super(nome,email,ra);
		
		limiteEmprestimo = 7;
		prazoEmprestimo = 30;
		multaAtraso = 0.5;
						
	}
	
}
