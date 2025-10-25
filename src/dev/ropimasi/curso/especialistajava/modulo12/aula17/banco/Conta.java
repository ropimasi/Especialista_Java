package dev.ropimasi.curso.especialistajava.modulo12.aula17.banco;

import java.util.Objects;




public class Conta {

	private Titular titular;
	private int agencia;
	private int numero;
	private double saldo;



	public Conta(Titular titular, int agencia, int numero) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}



	public Titular getTitular() {
		return titular;
	}



	public int getAgencia() {
		return agencia;
	}



	public int getNumero() {
		return numero;
	}



	public final double getSaldo() {
		return saldo;
	}



	protected void validarSaldoParaSaque(double valorSaque) {
		if (valorSaque > getSaldo()) {
			throw new IllegalArgumentException("Saldo insuficiente para saque: " + getSaldo());
		}
	}



	public final void sacar(double valorSaque) {
		if (valorSaque <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
		}

		validarSaldoParaSaque(valorSaque);

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
		System.out.printf("Agência: %d%n", getAgencia());
		System.out.printf("Número da Conta: %d%n", getNumero());
		System.out.printf("Titular: %s%n", getTitular().getNome());
		System.out.printf("Saldo: R$ %.2f%n", getSaldo());
	}



	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", agencia=" + agencia + ", numero=" + numero + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return agencia == other.agencia && numero == other.numero;
	}

}
