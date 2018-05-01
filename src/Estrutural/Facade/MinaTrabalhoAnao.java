package Estrutural.Facade;

public abstract class MinaTrabalhoAnao {

	public abstract String nome();

	public abstract void trabalhe();

	static enum Acao {
		VA_PARA_MINA, ACORDE, VA_PARA_CASA, VA_DORMIR, TRABALHE
	}

	public void vaDormir() {
		System.out.println(nome() + " vá Dormir!");
	}

	public void acordar() {
		System.out.println(nome() + " acorde!");
	}

	public void vaParaCasa() {
		System.out.println(nome() + " va para casa.");
	}

	public void vaParaMina() {
		System.out.println(nome() + " va para mina.");
	}

	private void acao(Acao acao) {
		switch (acao) {
		case VA_DORMIR:
			vaDormir();
			break;
		case ACORDE:
			acordar();
			break;
		case VA_PARA_CASA:
			vaParaCasa();
			break;
		case VA_PARA_MINA:
			vaParaMina();
			break;
		case TRABALHE:
			trabalhe();
			break;
		default:
			System.err.println("Ação não definida");
			break;
		}
	}

	public void acao(Acao... acaos) {
		for (Acao acao : acaos) {
			acao(acao);
		}
	}

}
