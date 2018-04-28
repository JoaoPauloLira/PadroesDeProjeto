package Criacao.Factory;

public class FerreiroParaElfo implements Ferreiro {

	@Override
	public Arma fabricacaoArmas(TipoArma tipoArma) {
		return new ArmaElfo(tipoArma);
	}

}
