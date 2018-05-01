package Estrutural.Decorator;

public class MagoDecorator extends Mago {

	protected Mago mago;

	public MagoDecorator(Mago mago) {
		this.mago = mago;
	}

	@Override
	public void atacar() {
		mago.atacar();
	}

	@Override
	public int getPoderAtaque() {
		return mago.getPoderAtaque();
	}

	@Override
	public void fugirBatalha() {
		mago.fugirBatalha();
	}

}
