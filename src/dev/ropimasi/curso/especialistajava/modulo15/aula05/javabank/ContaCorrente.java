package dev.ropimasi.curso.especialistajava.modulo15.aula05.javabank;

public class ContaCorrente implements Conta {

	private double saldo;



	@Override
	public double getSaldo() {
		return this.saldo;
	}



	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}



	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}



	@Override
	public void transferir(Conta conta, double valor) {
		//		this.saldo -= valor;
		sacar(valor);
		conta.depositar(valor);
	}



	protected void sacarTarifa(double valorTarifa) {
		this.saldo -= valorTarifa;
	}



	@Override
	public void aplicarEmInvestimento(double valor) {
		this.saldo -= valor;
		// Lógica de aplicação em investimento.

	}

}
