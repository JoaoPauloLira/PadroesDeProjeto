package Comportamental.Command;

import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {
	private List<Command> historico = new ArrayList<>();

	public void historicoDeExecucoes(Command cmd) {
		this.historico.add(cmd);
		cmd.executar();
	}
}
