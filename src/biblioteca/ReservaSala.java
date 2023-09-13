package biblioteca;

import java.time.LocalDate;
import item.Item;


public class ReservaSala {
	private LocalDate dataReserva;
	private int horaInicio;
	private int horaFim;
	private StatusReserva StatusReservaSala;

	
	public class SalaIndividual{
		private boolean haPC;
		private int numSala; 
		
	}
	public class SalaGrupo{
		private int numMaxPessoas;
		private boolean haEquipamento;
	}
	public class SalaSilenciosa{
		private boolean haCabine;
		private int numAssentos; 
	}
	public class SalaMultimidia{
		private Item[] itensMultimidia;
	}

	
	enum StatusReserva{
		PENDENTE, CONFIRMADA, CANCELADA;
	}
}
