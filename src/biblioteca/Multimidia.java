package biblioteca;

import item.Item;

public class Multimidia {
	private Item[] itensMultimidia;
	
	public class Audio{
		FormatoMultimidia itensMultimidia = FormatoMultimidia.AUDIO;
	}
	public class Video{
		FormatoMultimidia itensMultimidia = FormatoMultimidia.VIDEO;
	}
	public class Software{
		FormatoMultimidia itensMultimidia = FormatoMultimidia.SOFTWARE;
	}
	
	
	enum FormatoMultimidia{
		AUDIO, VIDEO, SOFTWARE;
	}
}
