package dev.ropimasi.curso.especialistajava.modulo14.aula06.financeira.modelo;

public class Funcionario implements ClienteFinanciavel {

	private static final int QUANTIDADE_SALARIO_LIMITE_CREDITO = 5;

	private String nome;
	private double salarioMensal;



	public Funcionario(String nome, double salarioMensal) {
		super();
		this.nome = nome;
		this.salarioMensal = salarioMensal;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalarioMensal() {
		return salarioMensal;
	}



	@Override
	public double calcularLimiteAprovado() {
		return getSalarioMensal() * QUANTIDADE_SALARIO_LIMITE_CREDITO;
	}

}
