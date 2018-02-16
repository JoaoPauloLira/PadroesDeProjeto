package Comportamental.Observer;

public class Main {

	private static AssinanteJornal_01 assinante01;
	private static AssinanteJornal_03 assinante03;
	private static AssinanteJornal_02 assinante02;

	public static void main(String[] args) {
		EntregadorDeJornais entregador = new EntregadorDeJornais();
		
		assinante01 = new AssinanteJornal_01(entregador);
		assinante02 = new AssinanteJornal_02(entregador);
		assinante03 = new AssinanteJornal_03(entregador);
		
		entregador.SetEntreDeJornais("Preço do jornal deve subir nos proximos dias", 8.0);
	}
} 