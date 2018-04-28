package Criacao.Factory;

public class ArmaGuerreiro implements Arma {

	private TipoArma tipoArma;

	public ArmaGuerreiro(TipoArma tipoArma) {
		this.tipoArma = tipoArma;
	}

	@Override
	public TipoArma getTipoArma() {
		return tipoArma;
	}

	@Override
	public String toString() {
		return "Guerreiro " + tipoArma;
	}

}
