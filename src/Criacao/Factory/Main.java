package Criacao.Factory;

public class Main {
	public static void main(String[] args) {
		Ferreiro ferreiroGuerreiro = new FerreiroParaGuerreiro();
		Arma armaGuerreiro = ferreiroGuerreiro.fabricacaoArmas(TipoArma.ESPADA_CURTA);
		System.out.println(armaGuerreiro);

		Ferreiro ferreiroElfo = new FerreiroParaElfo();
		Arma armaElfa = ferreiroElfo.fabricacaoArmas(TipoArma.LANCA);
		System.out.println(armaElfa);

	}
}
