package membro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import biblioteca.Emprestimo;
import item.Item;

public abstract class Membro {

	//atributos da classe
	private String nome;
	private String email;
	private int ra;
	
	protected double valorDebito = 0;
	protected boolean usuarioStatus = true;
	protected Emprestimo[] emprestimos = new Emprestimo[0];
	protected Item[] itens = new Item[0];
	
	//Criando os modos de reserva para cada membro
	protected int limiteEmprestimo;
	protected int prazoEmprestimo;
	protected double multaAtraso; 
	
	//Construtor
	public Membro(String nome, String email, int ra) {
		this.nome = nome;
		this.email = email;
		this.ra = ra;
	}
					
	
	//Getters para acessar os atributos privado
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getRa() {
		return ra;
	}
	
	public boolean getUsuarioStatus() {
		return usuarioStatus;
	}
	
	public void setUsuarioStatus(boolean novoStatus) {
		this.usuarioStatus = novoStatus;
	}
	
	public Emprestimo[] getEmprestimos() {
		return this.emprestimos;
	}
	
	public Item[] getItens() {
		return this.itens;
	}
	
	//Testando emprestar o item a partir da classe item, decidiremos posteriormente qual melhor :)
	// Metodos
	public void emprestarItem(Item item) {
			//Se pode pegar mais livro:
			if(itens.length < this.limiteEmprestimo) {
				//Se o usuário tem pendencias:
				if(this.usuarioStatus == true) {
					//Se o livro está disponível:
					if(item.getItemStatus() == true) {
						item.setItemStatus(false);
						LocalDate dHoje = LocalDate.now();
						this.emprestimos[this.emprestimos.length + 1] = new Emprestimo(this, item, dHoje) ;
						this.itens[this.itens.length + 1] = item;
					}
				}
			}
		}
	
	//Testando fazer a devolução a partir da classe de emprestimo do item
	public void devolverItem(Emprestimo emprestimo) {
		// Libera o livro p/ locação
		emprestimo.getItemEmprestado().setItemStatus(true);
		// Verifica se teve atraso
		LocalDate dHoje = LocalDate.now();
		long diferencaDias = ChronoUnit.DAYS.between(dHoje, emprestimo.getDataEmprestimo());
		// Se teve, aplica multa e coloca o usuario como false
		if(diferencaDias > this.prazoEmprestimo) {
			this.valorDebito = diferencaDias*this.multaAtraso;
		}
		// Retira o item da lista de itens do usuario
		
		//Pensamos em como criar listas para os membros, afim de podermos ter relatórios de uso e históricos do emprestimos
		
	}
		
	public void pagarMulta() {
		// Zera o valor em débito
		this.valorDebito = 0;
		// Muda o estado do usuario para true
		setUsuarioStatus(true);
	}
	
}
