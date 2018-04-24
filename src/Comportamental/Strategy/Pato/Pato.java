package Comportamental.Strategy.Pato;

import Comportamental.Strategy.Som.ComportamentoSom;
import Comportamental.Strategy.Voo.ComportamentoVoo;

public class Pato {

	private String nome;
	private String cores;

	private ComportamentoVoo voo;
	private ComportamentoSom som;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

	public void setComportamentoVoo(ComportamentoVoo comportamentoVoo) {
		this.voo = comportamentoVoo;
	}

	public void setComportamentoSom(ComportamentoSom comportamentoSom) {
		this.som = comportamentoSom;
	}

	public void Som() {
		som.comportamentoSom();
	}

	public void Voo() {
		voo.comportamentoVoo();
	}
}
