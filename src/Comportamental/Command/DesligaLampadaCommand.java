package Comportamental.Command;

public class DesligaLampadaCommand implements Command {

	private Lampada lampada;

	public DesligaLampadaCommand(Lampada lampada) {
		this.lampada = lampada;
	}

	@Override
	public void executar() {
		lampada.desligada();
	}

}
