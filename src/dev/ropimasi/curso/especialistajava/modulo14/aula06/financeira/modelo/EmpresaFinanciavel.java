package dev.ropimasi.curso.especialistajava.modulo14.aula06.financeira.modelo;

public abstract class EmpresaFinanciavel extends Empresa {

	public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
		super(razaoSocial, totalFaturamento);
	}



	public abstract double calcularLimiteAprovado();
}
