package Estrutural.Facade;

public class Main {
	public static void main(String[] args) {
		MinaOuroAnaoFacade fachada = new MinaOuroAnaoFacade();
		fachada.iniciaNovoDia();
		fachada.escavarOuro();
		fachada.fimDia();
	}
}
