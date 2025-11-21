package dev.ropimasi.curso.especialistajava.modulo15.aula04.algabank;

import java.util.Objects;
import dev.ropimasi.curso.especialistajava.modulo15.aula04.javabank.Conta;




public class ContaComTributacao implements Conta {

	private static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

	private Conta contaOriginal;



	public ContaComTributacao(Conta contaOriginal) {
		super();
		Objects.requireNonNull(contaOriginal, "A conta original não pode ser nula.");
		this.contaOriginal = contaOriginal;
	}



	public double getSaldo() {
		return contaOriginal.getSaldo();
	}



	public void sacar(double valor) {
		contaOriginal.sacar(valor);
		debitarImpostoMovimentacao(valor);
	}



	public void depositar(double valor) {
		contaOriginal.depositar(valor);
	}



	public void transferir(Conta conta, double valor) {
		contaOriginal.transferir(conta, valor);
		debitarImpostoMovimentacao(valor);
	}



	private void debitarImpostoMovimentacao(double valormOVIMENTACAO) {
		contaOriginal.sacar(valormOVIMENTACAO * TAXA_IMPOSTO_MOVIMENTACAO);
	}



	@Override
	public void aplicarEmInvestimento(double valor) {
		contaOriginal.aplicarEmInvestimento(valor);
		debitarImpostoMovimentacao(valor);
	}
}
