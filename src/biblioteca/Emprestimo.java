package biblioteca;

import java.util.Date;

import membro.Membro;

public class Emprestimo {

	private Membro membroResponsavel;
	private Item itemEmprestado;
	private Date dataEmprestimo;
	
	public Emprestimo(Membro membroResponsavel, Item itemEmprestado, Date dataEmprestimo) {
		this.membroResponsavel = membroResponsavel;
		this.itemEmprestado = itemEmprestado;
		this.dataEmprestimo = dataEmprestimo;
	}
	
	//Getter e Setter
	public Date getDataEmprestimo() {
		return this.dataEmprestimo;
	}
	
	public void setDataEmprestimo(Date dataEmprestimo) {
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
