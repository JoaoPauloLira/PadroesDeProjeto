package Comportamental.Observer;

public interface ISujeito {
	void RegistraObservador(IObservador o);
	void RemoveObservador(IObservador o);
	void NotificarObservador();	
}
