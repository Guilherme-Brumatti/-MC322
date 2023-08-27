package item;

import biblioteca.Item;

public class CDAudio {

	private Item dados;
	
	public CDAudio(Item dados) {
		this.dados = dados;
	}
	
	public Item getDados() {
		return this.dados;
	}
	
	public void setDados(Item dados) {
		this.dados = dados;
	}
}
