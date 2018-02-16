package Comportamental.Observer;

public class AssinanteJornal_03 implements IObservador, IMostrarElemento{

	private String titulo;
	private double valor;

	public AssinanteJornal_03(EntregadorDeJornais entregadorDeJornais) {
		entregadorDeJornais.RegistraObservador(this);
	}
		
	@Override
	public void Informar(String titulo, double valor) {
		this.titulo = titulo;
		this.valor = valor;
		Mostrar();
	}

	@Override
	public void Mostrar() {
		System.out.println("Entraga realizada para o assinante 3, Titulo da capa: "+ this.titulo +", valor do jornal: " + (this.valor - (this.valor * 0.65)) );
	}

}
