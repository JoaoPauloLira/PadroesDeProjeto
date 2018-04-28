package Estutural.Decorator;

public class CajadoDraconicoMago extends MagoDecorator {

	private int poderAtaque = 55;

	public CajadoDraconicoMago(Mago mago) {
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
