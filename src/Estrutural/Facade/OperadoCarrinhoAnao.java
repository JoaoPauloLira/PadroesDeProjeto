package Estrutural.Facade;

public class OperadoCarrinhoAnao extends MinaTrabalhoAnao {

	@Override
	public String nome() {
		return "Operador de carrinho anão";
	}

	@Override
	public void trabalhe() {
		System.out.println(nome() + " move pedaços de ouro para fora da mina");
	}

}
