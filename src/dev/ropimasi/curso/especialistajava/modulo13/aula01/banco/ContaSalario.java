package dev.ropimasi.curso.especialistajava.modulo13.aula01.banco;

public class ContaSalario extends Conta {

	private double salarioMensal;



	public ContaSalario(Titular titular, int agencia, int numero, double salarioMensal) {
		super(titular, agencia, numero);
		this.salarioMensal = salarioMensal;
	}



	public double getSalarioMensal() {
		return salarioMensal;
	}



	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}
