package dev.ropimasi.curso.especialistajava.modulo15.aula05.algabank;

import dev.ropimasi.curso.especialistajava.modulo15.aula05.javabank.Conta;
import dev.ropimasi.curso.especialistajava.modulo15.aula05.javabank.ContaCorrente;




public class Principal {

	public static void main(String[] args) {

		ContaPontuacaoDecorator contaPontuacao = new ContaPontuacaoDecorator(new ContaCorrente());
		Conta conta1 = new ContaTributacaoDecorator(contaPontuacao);
		Conta conta2 = new ContaCorrente();

		conta1.depositar(1000);
		conta1.sacar(100);
		conta1.transferir(conta2, 100);

		System.out.printf("Saldo conta 1: R$%.2f%n", conta1.getSaldo());
		System.out.printf("Saldo conta 2: R$%.2f%n", conta2.getSaldo());
		System.out.printf("Pontos conta 1: %d%n", contaPontuacao.getPontos());
		

	}

}
