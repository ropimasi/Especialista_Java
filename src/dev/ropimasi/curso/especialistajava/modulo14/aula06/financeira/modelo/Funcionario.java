package dev.ropimasi.curso.especialistajava.modulo14.aula06.financeira.modelo;

public class Funcionario extends EmpresaFinanciavel {

	private static final int QUANTIDADE_SALARIO_LIMITE_CREDITO = 5;
	private double salarioMensal;



	public Funcionario(String nome, double salarioMensal) {
		super(nome, 0);
		this.salarioMensal = salarioMensal;
	}



	public double getSalarioMensal() {
		return salarioMensal;
	}



	@Override
	public double calcularLimiteAprovado() {
		return getSalarioMensal() * QUANTIDADE_SALARIO_LIMITE_CREDITO;
	}

}
