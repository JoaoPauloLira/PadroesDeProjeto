package Comportamental.Strategy.Pato;

import Comportamental.Strategy.Som.SomComum;
import Comportamental.Strategy.Voo.VooComum;

public class PatoComum extends Pato {

	public PatoComum() {
		setComportamentoSom(new SomComum());
		setComportamentoVoo(new VooComum());
	}

}
