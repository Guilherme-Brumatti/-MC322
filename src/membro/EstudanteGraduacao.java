package membro;

public class EstudanteGraduacao extends Membro {
	
	public EstudanteGraduacao(String nome, String email, int ra) {
		super(nome,email,ra);
		
		limiteEmprestimo = 3;
		prazoEmprestimo = 15;
		multaAtraso = 1;
						
	}
	
}
