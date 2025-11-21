package dev.ropimasi.curso.especialistajava.modulo15.aula05.algabank;

import dev.ropimasi.curso.especialistajava.modulo15.aula05.javabank.Conta;




public class ContaTributacaoDecorator extends ContaBaseDecorator { // implements Conta {

	private static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;



	public ContaTributacaoDecorator(Conta contaOriginal) {
		super(contaOriginal);
	}



	@Override
	public void sacar(double valor) {
		getContaOriginal().sacar(valor);
		debitarImpostoMovimentacao(valor);
	}



	@Override
	public void transferir(Conta conta, double valor) {
		getContaOriginal().transferir(conta, valor);
		debitarImpostoMovimentacao(valor);
	}



	@Override
	public void aplicarEmInvestimento(double valor) {
		getContaOriginal().aplicarEmInvestimento(valor);
		debitarImpostoMovimentacao(valor);
	}



	private void debitarImpostoMovimentacao(double valormOVIMENTACAO) {
		getContaOriginal().sacar(valormOVIMENTACAO * TAXA_IMPOSTO_MOVIMENTACAO);
	}

}
