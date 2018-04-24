package Comportamental.Strategy.Pato;

import Comportamental.Strategy.Som.NaoFazSom;
import Comportamental.Strategy.Voo.NaoVoa;

public class PatoDeMadeira extends Pato {

	public PatoDeMadeira() {
		setComportamentoSom(new NaoFazSom());
		setComportamentoVoo(new NaoVoa());
	}
}
