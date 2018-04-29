package Comportamental.Command;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		Command ligaLampada = new LigaLampadaCommand(lampada);
		Command desligaLampada = new DesligaLampadaCommand(lampada);

		ControleRemoto controleRemoto = new ControleRemoto();

		int valor = JOptionPane.showConfirmDialog(null, "Você deseja ligar a lampada?");

		switch (valor) {
		case 0:
			controleRemoto.historicoDeExecucoes(ligaLampada);
			break;
		case 1:
			controleRemoto.historicoDeExecucoes(desligaLampada);
			break;
		default:
			System.out.println("Escolha sim para ligar a lampada ou não para manter desligada.");
		}

	}
}
