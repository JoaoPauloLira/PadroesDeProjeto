package Estrutural.Facade;

public class EscavadorTunioAnao extends MinaTrabalhoAnao {

	@Override
	public String nome() {
		return "An�o escavador de tunies";
	}

	@Override
	public void trabalhe() {
		System.out.println(nome() + " criou outro tuneo com sucesso!");
	}

}
