package dev.ropimasi.curso.especialistajava.modulo13.aula08.fiscal;

public class NotaFiscalServico extends NotaFiscal {

	public static final double VALOR_MAXIMO_ISENCAO_FISCAL = 1000.0;
	public static final double ALIQUOTA_IMPOSTOS = 0.15;

	private boolean intermunicipal;



	public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
		super(descricao, valorTotal);
		this.intermunicipal = intermunicipal;
	}



	public boolean getValorFrete() {
		return intermunicipal;
	}



	public boolean isIntermunicipal() {
		return intermunicipal;
	}



	protected boolean isIsentoImpostos() {
		return isIntermunicipal() && getValorTotal() <= VALOR_MAXIMO_ISENCAO_FISCAL;
	}



	@Override
	public double calcularImpostos() {
		double valorImpostos = (getValorTotal() * ALIQUOTA_IMPOSTOS);

		if (isIsentoImpostos()) {
			valorImpostos = 0.0;
		}

		return valorImpostos;
	}

}
