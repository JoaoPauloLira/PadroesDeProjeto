package Comportamental.Strategy.Som;

public class NaoFazSom implements ComportamentoSom {

	@Override
	public void comportamentoSom() {
		System.out.println("N�o fa�o som!");
	}

}
