package item;

import biblioteca.Item;

public class DVDVideo {
	
	private Item dados;
	
	public DVDVideo(Item dados) {
		this.dados = dados;
	}
	
	public Item getDados() {
		return this.dados;
	}
	
	public void setDados(Item dados) {
		this.dados = dados;
	}
}
