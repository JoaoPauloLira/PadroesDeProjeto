package Estrutural.Adapter;

public class BarcoPescaAdapter implements BarcoRemo {

	private BarcoPesca barcoPesca;

	public BarcoPescaAdapter() {
		barcoPesca = new BarcoPesca();
	}

	@Override
	public void remar() {
		barcoPesca.velar();
	}

}
