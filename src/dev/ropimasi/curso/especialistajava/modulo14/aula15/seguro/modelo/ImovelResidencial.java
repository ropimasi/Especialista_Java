package dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.modelo;

public class ImovelResidencial implements BemSeguravel {

	private static final double FATOR_VALOR_PREMIO_POR_VALOR_MERCADO = 0.001;
	private static final double ADICIONAL_POR_METRO_CONSTRUIDO = 0.30;

	private double valorMercado;
	private int areaConstruida;



	public ImovelResidencial(double valorMercado, int areaConstruida) {
		super();
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}



	public double getValorMercado() {
		return valorMercado;
	}



	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}



	public int getAreaConstruida() {
		return areaConstruida;
	}



	public void setAreaConstruida(int areaConstruida) {
		this.areaConstruida = areaConstruida;
	}



	@Override
	public double calcularValorPremio() {
		return (ADICIONAL_POR_METRO_CONSTRUIDO * getAreaConstruida())
				+ (FATOR_VALOR_PREMIO_POR_VALOR_MERCADO * getValorMercado());
	}



	@Override
	public String descrever() {
		return String.format("Imóvel residencial com %dm2 de área construída, avaliado em R$%.2f",
				getAreaConstruida(), getValorMercado());
	}

}
