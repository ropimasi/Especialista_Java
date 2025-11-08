package dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.modelo;

public class CarroParticular extends VeiculoAutomotor {

	private static final double TAXA_BASE_CARRO = 0.04;
	private static final double TAXA_ADICIONAL_CARRO_ANTIGO = 1.05;
	private static final int ANO_LIMITE_CARRO_ANTIGO = 1999;



	public CarroParticular(String modelo, int anoFabricacao, double valorMercado) {
		super(modelo, anoFabricacao, valorMercado);
	}



	@Override
	public double calcularValorPremio() {
		double premio = getValorMercado() * TAXA_BASE_CARRO;

		if (isCarroAntigo()) {
			premio *= TAXA_ADICIONAL_CARRO_ANTIGO;
		}

		return premio;
	}



	protected boolean isCarroAntigo() {
		return getAnoFabricacao() <= ANO_LIMITE_CARRO_ANTIGO;
	}



	@Override
	public String descrever() {
		return String.format("Carro particular %s do ano %d%s, avaliado em R$%.2f",
				getModelo(), getAnoFabricacao(),
				isCarroAntigo() ? " (antigo)" : "", getValorMercado());
	}

}
