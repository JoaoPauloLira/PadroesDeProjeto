package Estrutural.Facade;

public class EscavadorTunioAnao extends MinaTrabalhoAnao {

	@Override
	public String nome() {
		return "Anão escavador de tunies";
	}

	@Override
	public void trabalhe() {
		System.out.println(nome() + " criou outro tuneo com sucesso!");
	}

}
