package Estrutural.Facade;

public class EscavadorOuroAnao extends MinaTrabalhoAnao {

	@Override
	public String nome() {
		return "Escavador de ouro an�o";
	}

	@Override
	public void trabalhe() {
		System.out.println(nome() + " escava para encontrar ouro");
	}

}
