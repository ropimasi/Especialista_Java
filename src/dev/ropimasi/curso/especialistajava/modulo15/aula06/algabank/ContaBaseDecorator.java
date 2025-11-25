package dev.ropimasi.curso.especialistajava.modulo15.aula06.algabank;

import java.util.Objects;
import dev.ropimasi.curso.especialistajava.modulo15.aula06.javabank.Conta;




public abstract class ContaBaseDecorator implements Conta {

	private Conta contaOriginal;



	public ContaBaseDecorator(Conta contaOriginal) {
		super();
		Objects.requireNonNull(contaOriginal, "A conta original não pode ser nula.");
		this.contaOriginal = contaOriginal;
	}



	public Conta getContaOriginal() {
		return contaOriginal;
	}



	@Override
	public double getSaldo() {
		return contaOriginal.getSaldo();
	}



	@Override
	public void sacar(double valor) {
		contaOriginal.sacar(valor);
	}



	@Override
	public void depositar(double valor) {
		contaOriginal.depositar(valor);
	}



	@Override
	public void transferir(Conta conta, double valor) {
		contaOriginal.transferir(conta, valor);
	}



	@Override
	public void aplicarEmInvestimento(double valor) {
		contaOriginal.aplicarEmInvestimento(valor);
	}


	@Override
	public void imprimirSaldo() {
		contaOriginal.imprimirSaldo();
	}

	
	
}
