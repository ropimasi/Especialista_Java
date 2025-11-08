package dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.modelo;

public abstract class VeiculoAutomotor implements BemSeguravel {

	private String modelo;
	private int anoFabricacao;
	private double valorMercado;



	public VeiculoAutomotor(String modelo, int anoFabricacao, double valorMercado) {
		super();
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.valorMercado = valorMercado;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAnoFabricacao() {
		return anoFabricacao;
	}



	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}



	public double getValorMercado() {
		return valorMercado;
	}



	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

}
