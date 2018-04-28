package Estutural.Decorator;

public class AnelDraconicoMago extends MagoDecorator {

	private int poderAtaque = 29;

	public AnelDraconicoMago(Mago mago) {
		super(mago);
	}

	@Override
	public void atacar() {
		super.atacar();
	}

	@Override
	public int getPoderAtaque() {
		return super.getPoderAtaque() + poderAtaque;
	}

	@Override
	public void fugirBatalha() {
		super.fugirBatalha();
	}
}