package item;

public class LivroFisico extends Item {
	
	private String isbn;
	private String edicao;
	private String total_copias;
	private String copias_disponiveis_edicao;
	private String localizacao;
	private String estado_conservacao;
		
	public LivroFisico (String isbn, String edicao, String total_copias, String copias_disponiveis_edicao, 
			            String localizacao, String estado_conservacao, String nome, String editora, 
			            String autor, String assunto, String anopublicacao, String sinopse, String capa) {
		super(nome, editora, autor, assunto, anopublicacao, sinopse, capa);
		
		this.isbn = isbn;
		this.edicao = edicao;
		this.total_copias = total_copias;
		this.copias_disponiveis_edicao = copias_disponiveis_edicao;
		this.localizacao = localizacao;
		this.estado_conservacao = estado_conservacao;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getEdicao() {
		return edicao;
	}
	
	public String getTotal_copias() {
		return total_copias;
	}
	
	public String getCopias_disponiveis_edicao() {
		return copias_disponiveis_edicao;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	
	public String getEstado_conservacao() {
		return estado_conservacao;
	}
	
}
