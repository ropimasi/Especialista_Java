package dev.ropimasi.curso.especialistajava.modulo14.aula06.financeira.modelo;

public class ParceiroFinanceiro extends Empresa {

	private double valorTotalAplicado;



	public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
		super(razaoSocial, totalFaturamento);
	}



	public double getValorTotalAplicado() {
		return valorTotalAplicado;
	}

}
