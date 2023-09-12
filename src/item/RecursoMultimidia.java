package item;

public class RecursoMultimidia extends Item {
	
	private String recurso;
	private String formato;
	private String total_copias;
	private String copias_disponiveis;
	private String localizacao;
	private String estado_conservacao;
	
	public RecursoMultimidia (String recurso, String formato, String total_copias, String copias_disponiveis, 
			String localizacao, String estado_conservacao, String nome, String editora, String autor, String assunto, 
			String anopublicacao, String sinopse, String capa) {
		super(nome, editora, autor, assunto, anopublicacao, sinopse, capa);
		
		this.recurso = recurso;
		this.formato = formato;
		this.total_copias = total_copias;
		this.copias_disponiveis = copias_disponiveis;
		this.localizacao = localizacao;
		this.estado_conservacao = estado_conservacao;
	}
	
	public String getRecurso() {
		return recurso;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public String getTotal_copias() {
		return total_copias;
	}
	
	public String getCopias_disponiveis() {
		return copias_disponiveis;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	
	public String getEstado_conservacao() {
		return estado_conservacao;
	}
}
