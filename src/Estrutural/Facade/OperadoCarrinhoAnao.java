package Estrutural.Facade;

public class OperadoCarrinhoAnao extends MinaTrabalhoAnao {

	@Override
	public String nome() {
		return "Operador de carrinho an�o";
	}

	@Override
	public void trabalhe() {
		System.out.println(nome() + " move peda�os de ouro para fora da mina");
	}

}
