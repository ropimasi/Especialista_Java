package dev.ropimasi.curso.especialistajava.modulo15.aula03.algabank;

import dev.ropimasi.curso.especialistajava.modulo15.aula03.javabank.Conta;
import dev.ropimasi.curso.especialistajava.modulo15.aula03.javabank.ContaCorrente;

public class ContaCorrenteComTributacao extends ContaCorrente {

	private static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		sacarTarifa(valor);
	}
	
//	Quando a superclasse da biblioteca de terceiros foi atualizada afetou este método.
//	@Override
//	public void transferir(Conta conta, double valor) {
//		super.transferir(conta, valor);
//		super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
//	}
	
	@Override
	public void aplicarEmInvestimento(double valor) {
		super.aplicarEmInvestimento(valor);
		sacarTarifa(valor);
	}

	protected void sacarTarifa(double valorMovimentacao) {
		super.sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
	}
	
}
