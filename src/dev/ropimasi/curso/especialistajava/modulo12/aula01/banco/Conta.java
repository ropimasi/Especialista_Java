package dev.ropimasi.curso.especialistajava.modulo12.aula01.banco;

public class Conta {

	private Titular titular;
	private int agencia;
	private int numero;
	private double saldo;



	public Titular getTitular() {
		return titular;
	}



	public void setTitular(Titular titular) {
		this.titular = titular;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public double getSaldo() {
		return saldo;
	}



	public void sacar(double valorSaque) {
		if (valorSaque <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
		}
		if (valorSaque > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para saque");
		}
		saldo -= valorSaque;
	}



	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
		}
		saldo += valorDeposito;
	}



	public void imprimirDemonstrativo() {
		System.out.printf("------------------------%n");
		System.out.printf("Agência: %d%n", agencia);
		System.out.printf("Número da Conta: %d%n", numero);
		System.out.printf("Titular: %s%n", titular.getNome());
		System.out.printf("Saldo: R$ %.2f%n", saldo);
		System.out.printf("------------------------%n");
	}

}
