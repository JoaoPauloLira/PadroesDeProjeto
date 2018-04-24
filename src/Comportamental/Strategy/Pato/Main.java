package Comportamental.Strategy.Pato;

public class Main {

	public static void main(String[] args) {

		Pato patoComum = new PatoComum();
		Pato patoBorracha = new PatoDeBorracha();
		Pato patoMadeira = new PatoDeMadeira();

		System.err.println("Pato Comum");
		patoComum.Som();
		patoComum.Voo();

		System.err.println("Pato de Borracha");
		patoBorracha.Som();
		patoBorracha.Voo();

		System.err.println("Pato de Madeira");
		patoMadeira.Som();
		patoMadeira.Voo();

	}

}
