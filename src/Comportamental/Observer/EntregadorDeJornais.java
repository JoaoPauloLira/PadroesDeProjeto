package Comportamental.Observer;

import java.util.ArrayList;

public class EntregadorDeJornais implements ISujeito{

	private ArrayList<IObservador> observadores;
	private String titulo;
	private double valor;
	
   public EntregadorDeJornais() {
	   observadores = new ArrayList<IObservador>();
   }
	
	@Override
	public void RegistraObservador(IObservador o) {
		observadores.add(o);
	}

	@Override
	public void RemoveObservador(IObservador o) {
		observadores.remove(observadores.indexOf(o));
	}

	@Override
	public void NotificarObservador() {
		observadores.forEach(x -> x.Informar(titulo, valor));
	}

	public void EntregaRealizada() {
		NotificarObservador();
	}
	
	public void SetEntreDeJornais(String titulo, double valor) {
		this.titulo = titulo;
		this.valor = valor;
		EntregaRealizada();
	}
	
}
