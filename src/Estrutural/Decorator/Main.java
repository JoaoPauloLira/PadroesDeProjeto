package Estrutural.Decorator;

public class Main {

	public static void main(String[] args) {

		Mago mago = new MagoPadrao();

		mago = new MagoDecorator(new CajadoDraconicoMago(mago));

		System.err.println("Mago com cajado draconicos");
		System.out.println("Poder do mago: " + mago.getPoderAtaque());
		mago.atacar();
		mago.fugirBatalha();

		mago = new MagoDecorator(new AnelDraconicoMago(mago));

		System.err.println("Mago com cajado e anel draconicos");
		System.out.println("Poder do mago: " + mago.getPoderAtaque());
		mago.atacar();
		mago.fugirBatalha();

	}

}
