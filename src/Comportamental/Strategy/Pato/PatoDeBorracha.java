package Comportamental.Strategy.Pato;

import Comportamental.Strategy.Som.SomBorracha;
import Comportamental.Strategy.Voo.NaoVoa;

public class PatoDeBorracha extends Pato {

	public PatoDeBorracha() {
		setComportamentoSom(new SomBorracha());
		setComportamentoVoo(new NaoVoa());
	}

}
