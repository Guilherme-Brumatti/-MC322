package item;

import biblioteca.Item;

public class LivroEletronico {

	private Item dados;
	
	public LivroEletronico(Item dados) {
		this.dados = dados;
	}
	
	public Item getDados() {
		return this.dados;
	}
	
	public void setDados(Item dados) {
		this.dados = dados;
	}
}
