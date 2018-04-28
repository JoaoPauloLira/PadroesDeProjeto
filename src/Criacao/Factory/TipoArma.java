package Criacao.Factory;

public enum TipoArma {
	ESPADA_CURTA("Espada Curta"), LANCA("Lança"), MACHADO("Machado"), INDEFINIDO("Não definida");

	private String title;

	TipoArma(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
