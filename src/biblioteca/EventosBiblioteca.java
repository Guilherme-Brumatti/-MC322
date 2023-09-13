package biblioteca;

import java.time.LocalDate;

import item.Item;

public class EventosBiblioteca {

	public class Palestra{
		private String palestrante;
		private String tema;
		private LocalDate data;
		private int horario;
		private String local;
		
		private TipoDeEvento evento = TipoDeEvento.PALESTRA;
	}
	
	public class Workshop{
		private String instrutor;
		private String tema;
		private Item[] itensNecessarios;
		private LocalDate data;
		private int horario;
		private String local;
		private TipoDeEvento evento = TipoDeEvento.WORKSHOP;
	}
	
	public class Exposicao{
		private String tema;
		private String[] instrutores;
		private int duracao;
		private String local;
		private TipoDeEvento evento = TipoDeEvento.EXPOSIÇÃO;
	}
	
	enum TipoDeEvento{
		PALESTRA, WORKSHOP, EXPOSIÇÃO;
	}
}
