package Comportamental.Strategy.Voo;

public class NaoVoa implements ComportamentoVoo {

	@Override
	public void comportamentoVoo() {
		System.out.println("N�o posso voar");
	}
}
