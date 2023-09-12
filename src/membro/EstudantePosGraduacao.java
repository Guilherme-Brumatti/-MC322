package membro;

public class EstudantePosGraduacao extends Membro {
	
	public EstudantePosGraduacao(String nome, String email, int ra) {
		super(nome,email,ra);
		
		limiteEmprestimo = 5;
		prazoEmprestimo = 10;
		multaAtraso = 1.0;
						
	}
	
}
