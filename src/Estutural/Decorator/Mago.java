package Estutural.Decorator;

public abstract class Mago {

	public void atacar() {
		System.out.println("O mago tenta te atacar!");
	}

	public int getPoderAtaque() {
		return 10;
	}

	public void fugirBatalha() {
		System.out.println("O mago escapou!");
	}

}
