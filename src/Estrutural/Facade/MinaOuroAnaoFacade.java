package Estrutural.Facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MinaOuroAnaoFacade {

	private List<MinaTrabalhoAnao> trabalhadores;

	public MinaOuroAnaoFacade() {
		trabalhadores = new ArrayList<>();
		trabalhadores.add(new EscavadorOuroAnao());
		trabalhadores.add(new OperadoCarrinhoAnao());
		trabalhadores.add(new EscavadorTunioAnao());
	}

	public void iniciaNovoDia() {
		fazerAcao(trabalhadores, MinaTrabalhoAnao.Acao.ACORDE, MinaTrabalhoAnao.Acao.VA_PARA_MINA);
	}

	public void escavarOuro() {
		fazerAcao(trabalhadores, MinaTrabalhoAnao.Acao.TRABALHE);
	}

	public void fimDia() {
		fazerAcao(trabalhadores, MinaTrabalhoAnao.Acao.VA_PARA_CASA, MinaTrabalhoAnao.Acao.VA_DORMIR);
	}

	private static void fazerAcao(Collection<MinaTrabalhoAnao> trabalhadores, MinaTrabalhoAnao.Acao... acoes) {
		for (MinaTrabalhoAnao minaTrabalhoAnao : trabalhadores) {
			minaTrabalhoAnao.acao(acoes);
		}
	}
}
