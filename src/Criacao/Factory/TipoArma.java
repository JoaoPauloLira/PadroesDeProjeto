package Criacao.Factory;

public enum TipoArma {
	ESPADA_CURTA("Espada Curta"), LANCA("Lan�a"), MACHADO("Machado"), INDEFINIDO("N�o definida");

	private String title;

	TipoArma(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
