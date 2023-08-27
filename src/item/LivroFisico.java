package item;

import biblioteca.Item;

public class LivroFisico {
	
	private Item dados;
	
	public LivroFisico(Item dados) {
		this.dados = dados;
	}
	
	public Item getDados() {
		return this.dados;
	}
	
	public void setDados(Item dados) {
		this.dados = dados;
	}
}
