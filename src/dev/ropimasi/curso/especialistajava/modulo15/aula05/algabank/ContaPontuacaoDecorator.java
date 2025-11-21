package dev.ropimasi.curso.especialistajava.modulo15.aula05.algabank;

import dev.ropimasi.curso.especialistajava.modulo15.aula05.javabank.Conta;




public class ContaPontuacaoDecorator extends ContaBaseDecorator { //implements Conta {

	private int pontos;



	public ContaPontuacaoDecorator(Conta contaOriginal) {
		super(contaOriginal);
	}



	public int getPontos() {
		return pontos;
	}



	@Override
	public void depositar(double valor) {
		getContaOriginal().depositar(valor);
		pontos += (int) valor / 100;
	}

}
