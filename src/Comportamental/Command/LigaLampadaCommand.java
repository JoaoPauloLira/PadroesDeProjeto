package Comportamental.Command;

public class LigaLampadaCommand implements Command {

	private Lampada lampada;

	public LigaLampadaCommand(Lampada lampada) {
		this.lampada = lampada;
	}

	@Override
	public void executar() {
		lampada.ligada();
	}

}
