package item;

public class LivroEletronico extends Item {
	
	private String formato_arquivo;
	private String total_licencas;
	private String local_armazenamento;
	private String requisitos_leitura;
	private String data_disponibilidade;
	
	public LivroEletronico (String formato_arquivo, String total_licencas, String local_armazenamento, 
			String requisitos_leitura, String data_disponibilidade, String nome, String editora, 
            String autor, String assunto, String anopublicacao, String sinopse, String capa) {
		super(nome, editora, autor, assunto, anopublicacao, sinopse, capa);
		
		this.formato_arquivo = formato_arquivo;
		this.total_licencas = total_licencas;
		this.local_armazenamento = local_armazenamento;
		this.requisitos_leitura = requisitos_leitura;
		this.data_disponibilidade = data_disponibilidade;
}
	
	public String getFormato_arquivo() {
		return formato_arquivo;
	}
	
	public String getTotal_licencas() {
		return total_licencas;
	}
	
	public String getLocal_armazenamento() {
		return local_armazenamento;
	}
	
	public String getRequisitos_leitura() {
		return requisitos_leitura;
	}
	
	public String getData_disponibilidade() {
		return data_disponibilidade;
	}
	
}



