package dev.ropimasi.curso.especialistajava.modulo12.aula09.banco;

public class ContaInvestimento extends Conta{

	private double valorTotalRendimentos;



	public double getValorTotalRendimentos() {
		return valorTotalRendimentos;
	}



	public void creditarRendimentos(double percentualJuros) {
		double valorRendimentos = getSaldo() * percentualJuros / 100;
		this.valorTotalRendimentos += valorRendimentos;
		depositar(valorRendimentos);
	}

}
