package biblioteca;

import item.Item;

public class Equipamentos {
	private Item[] itensMultimidia;
	
	public class Informatica{
		CategoriaEquipamento itensMultimidia = CategoriaEquipamento.INFORMATICA;
	}
	public class Audiovisual{
		CategoriaEquipamento itensMultimidia = CategoriaEquipamento.AUDIOVISUAL;
	}
	public class Impressao{
		CategoriaEquipamento itensMultimidia = CategoriaEquipamento.IMPRESSÃO;
	}
	
	enum CategoriaEquipamento{
		INFORMATICA, AUDIOVISUAL, IMPRESSÃO;
	}
}
