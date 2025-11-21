package dev.ropimasi.curso.especialistajava.modulo15.aula02;

import java.util.Objects;

public class Locacao {

	private Notebook notebook;
	private Precificacao precificacao;
	private Seguro seguro;



	public Locacao(Notebook notebook, Precificacao precificacao) {
		Objects.requireNonNull(notebook);
		Objects.requireNonNull(precificacao);		
		this.notebook = notebook;
		this.precificacao = precificacao;
	}



	public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
		this(notebook, precificacao);
		Objects.requireNonNull(seguro);
		this.seguro = seguro;
	}



	public Notebook getNoteBook() {
		return this.notebook;
	}



	public Precificacao getPrecificacao() {
		return precificacao;
	}



	public Seguro getSeguro() {
		return seguro;
	}



	public boolean possuiSeguro() {
		return this.seguro != null;
	}
	

	public double calcularValorDevido(int horasUtilizadas) {
		double valorTotal = getPrecificacao()
				.calcularValorTotal(getNoteBook(), horasUtilizadas);

		if (possuiSeguro()) {
			valorTotal += getSeguro().calcularPremio(horasUtilizadas, valorTotal);
		}
		
		return valorTotal;
	}
}
