package dev.ropimasi.curso.especialistajava.modulo15.aula03.algabank;

import dev.ropimasi.curso.especialistajava.modulo15.aula03.javabank.Conta;
import dev.ropimasi.curso.especialistajava.modulo15.aula03.javabank.ContaCorrente;

public class Principal {

	public static void main(String[] args) {
		Conta conta1 = new ContaCorrenteComTributacao();
		Conta conta2 = new ContaCorrente();

		conta1.depositar(1000);
		System.out.printf("Saldo conta 1: R$%.2f%n", conta1.getSaldo());
		conta1.sacar(100);
		System.out.printf("Saldo conta 1: R$%.2f%n", conta1.getSaldo());
		conta1.transferir(conta2, 100);
		System.out.printf("Saldo conta 1: R$%.2f%n", conta1.getSaldo());
		conta1.aplicarEmInvestimento(200);
		System.out.printf("Saldo conta 1: R$%.2f%n", conta1.getSaldo());
		
		System.out.printf("Saldo conta 2: R$%.2f%n", conta2.getSaldo());
		
	}

}
