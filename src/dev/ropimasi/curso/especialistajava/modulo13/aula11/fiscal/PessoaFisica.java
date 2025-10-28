package dev.ropimasi.curso.especialistajava.modulo13.aula11.fiscal;

public class PessoaFisica extends Pessoa {

	public static final double RECEITA_ANUAL_ISENCAO = 50_000.0;
	public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

	private double receitaAnual;



	public PessoaFisica(String nome, double receitaAnual) {
		super(nome);
		this.receitaAnual = receitaAnual;
	}



	public double getReceitaAnual() {
		return receitaAnual;
	}



	@Override
	public double calcularImpostos() {
		return (getReceitaAnual() > RECEITA_ANUAL_ISENCAO)
				? getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA
				: 0;
	}

}
