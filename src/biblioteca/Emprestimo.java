package biblioteca;

import java.time.LocalDate;
import java.util.Date;

import item.Item;
import membro.Membro;

public class Emprestimo {

	private Membro membroResponsavel;
	private Item itemEmprestado;
	private LocalDate dataEmprestimo;
	
	public Emprestimo(Membro membroResponsavel, Item itemEmprestado, LocalDate dataEmprestimo) {
		this.membroResponsavel = membroResponsavel;
		this.itemEmprestado = itemEmprestado;
		this.dataEmprestimo = dataEmprestimo;
	}
	
	//Getter e Setter
	public LocalDate getDataEmprestimo() {
		return this.dataEmprestimo;
	}
	
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public Membro getMembro() {
		return this.membroResponsavel;
	}
	
	public void setMembro(Membro membroResponsavel) {
		this.membroResponsavel = membroResponsavel;
	}
	
	public Item getItemEmprestado() {
		return this.itemEmprestado;
	}
	
	public void setItemEmprestado(Item itemEmprestado) {
		this.itemEmprestado = itemEmprestado;
	}
}
