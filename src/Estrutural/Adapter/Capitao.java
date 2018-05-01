package Estrutural.Adapter;

public class Capitao implements BarcoRemo {

	private BarcoRemo barcoRemo;

	public Capitao(BarcoRemo barcoRemo) {
		this.barcoRemo = barcoRemo;
	}

	@Override
	public void remar() {
		barcoRemo.remar();
	}

}
