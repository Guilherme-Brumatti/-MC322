package item;

public class CDAudio extends Item {

	private String lista_faixas;
	private String duracao;
	private String total_copias;
	private String copias_disponiveis;
	private String estado_conservacao;
	
	public CDAudio (String lista_faixas, String duracao, String total_copias, String copias_disponiveis, 
			String estado_conservacao, String nome, String editora, String autor, String assunto, 
			String anopublicacao, String sinopse, String capa) {
		super(nome, editora, autor, assunto, anopublicacao, sinopse, capa);
		
		this.lista_faixas = lista_faixas;
		this.duracao = duracao;
		this.total_copias = total_copias;
		this.copias_disponiveis = copias_disponiveis;
		this.estado_conservacao = estado_conservacao;
	}
	
	public String getLista_faixas() {
		return lista_faixas;
	}
	
	public String getDuracao() {
		return duracao;
	}
	
	public String getTotal_copias() {
		return total_copias;
	}
	
	public String getCopias_disponiveis() {
		return copias_disponiveis;
	}
	
	public String getEstado_conservacao() {
		return estado_conservacao;
	}

}
