package dev.ropimasi.curso.especialistajava.modulo15.aula06.algabank;

import dev.ropimasi.curso.especialistajava.modulo15.aula06.javabank.Conta;
import dev.ropimasi.curso.especialistajava.modulo15.aula06.javabank.ContaCorrente;




public class Principal {

	public static void main(String[] args) {

		ContaAuditoriaDecorator conta1 = new ContaAuditoriaDecorator(new ContaCorrente());
		Conta conta2 = new ContaCorrente();

		conta1.depositar(1000);
		conta1.sacar(100);
		conta1.transferir(conta2, 100);
		conta1.imprimirSaldo();

		System.out.printf("Saldo conta 1: R$%.2f%n", conta1.getSaldo());
		System.out.printf("Saldo conta 2: R$%.2f%n", conta2.getSaldo());
		System.out.printf("Operações da conta 1: %d%n", conta1.getQuantidadeOperacoes());


	}

}
