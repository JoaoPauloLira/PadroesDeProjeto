package Estrutural.Adapter;

public class Main {
	public static void main(String[] args) {
		Capitao capitao = new Capitao(new BarcoPescaAdapter());
		capitao.remar();
	}
}
