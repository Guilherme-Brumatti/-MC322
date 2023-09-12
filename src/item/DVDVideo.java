package item;

public class DVDVideo extends Item {
	
	private String elenco;
	private String duracao;
	private String total_copias;
	private String copias_disponiveis;
	private String legenda_audio;
	private String estado_conservacao;
	
	public DVDVideo (String elenco, String duracao, String total_copias, String copias_disponiveis, 
			String legenda_audio, String estado_conservacao, String nome, String editora, 
            String autor, String assunto, String anopublicacao, String sinopse, String capa) {
		super(nome, editora, autor, assunto, anopublicacao, sinopse, capa);
		
		this.elenco = elenco;
		this.duracao = duracao;
		this.total_copias = total_copias;
		this.copias_disponiveis = copias_disponiveis;
		this.legenda_audio = legenda_audio;
		this.estado_conservacao = estado_conservacao;
	}
	
	public String getElenco() {
		return elenco;
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
	
	public String getLegenda_audio() {
		return legenda_audio;
	}
	
	public String getEstado_conservacao() {
		return estado_conservacao;
	}

}
