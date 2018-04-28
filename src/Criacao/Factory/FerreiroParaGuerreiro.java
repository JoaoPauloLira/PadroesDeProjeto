package Criacao.Factory;

public class FerreiroParaGuerreiro implements Ferreiro {

	@Override
	public Arma fabricacaoArmas(TipoArma tipoArma) {
		return new ArmaGuerreiro(tipoArma);
	}

}
