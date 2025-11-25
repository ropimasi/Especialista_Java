package dev.ropimasi.curso.especialistajava.modulo15.aula06.javabank;

public interface Conta {

	double getSaldo();
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(Conta conta, double valor);
	
	void aplicarEmInvestimento(double valor);
	
	default void imprimirSaldo() {
		System.out.printf("Saldo atual: R$%.2f%n", getSaldo());
	}
}
