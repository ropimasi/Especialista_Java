package dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.modelo;

public class Caminhao extends VeiculoAutomotor {

	private static final double TAXA_BASE_CAMINHAO = 0.02;
	private static final int TAXA_ADICIONAL_CAMINHAO_POR_EIXO = 50;

	private int quantidadeEixos;



	public Caminhao(String modelo, int anoFabricacao, double valorMercado, int quantidadeEixos) {
		super(modelo, anoFabricacao, valorMercado);
		this.quantidadeEixos = quantidadeEixos;
	}



	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}



	public void setQuantidadeEixos(int quantidadeEixos) {
		this.quantidadeEixos = quantidadeEixos;
	}



	@Override
	public double calcularValorPremio() {
		double premio = getValorMercado() * TAXA_BASE_CAMINHAO;
		premio += quantidadeEixos * TAXA_ADICIONAL_CAMINHAO_POR_EIXO;
		return premio;
	}



	@Override
	public String descrever() {
		return String.format("Caminhão %s do ano %d, avaliado em R$%.2f", getModelo(), getAnoFabricacao(),
				getValorMercado());
	}

}
