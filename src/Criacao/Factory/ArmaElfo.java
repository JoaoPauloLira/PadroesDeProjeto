package Criacao.Factory;

public class ArmaElfo implements Arma {

	private TipoArma tipoArma;

	public ArmaElfo(TipoArma tipoArma) {
		this.tipoArma = tipoArma;
	}

	@Override
	public TipoArma getTipoArma() {
		return tipoArma;
	}

	@Override
	public String toString() {
		return "Elfo " + tipoArma;
	}

}
