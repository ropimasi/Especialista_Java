package dev.ropimasi.curso.especialistajava.modulo15.aula06.algabank;

import dev.ropimasi.curso.especialistajava.modulo15.aula06.javabank.Conta;




public class ContaAuditoriaDecorator extends ContaBaseDecorator {

	private int quantidadeOperacoes;



	public ContaAuditoriaDecorator(Conta contaOriginal) {
		super(contaOriginal);
	}



	public int getQuantidadeOperacoes() {
		return quantidadeOperacoes;
	}



	@Override
	public void sacar(double valor) {
		quantidadeOperacoes++;
		getContaOriginal().sacar(valor);
	}



	@Override
	public void depositar(double valor) {
		quantidadeOperacoes++;
		getContaOriginal().depositar(valor);
	}



	@Override
	public void transferir(Conta conta, double valor) {
		quantidadeOperacoes++;
		super.transferir(conta, valor);
	}



	@Override
	public void aplicarEmInvestimento(double valor) {
		quantidadeOperacoes++;
		super.aplicarEmInvestimento(valor);
	}
	
	@Override
	public void imprimirSaldo() {
		quantidadeOperacoes++;
		super.imprimirSaldo();
	}
}
