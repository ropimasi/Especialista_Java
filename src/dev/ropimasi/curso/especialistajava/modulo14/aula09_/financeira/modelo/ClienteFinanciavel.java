package dev.ropimasi.curso.especialistajava.modulo14.aula09_.financeira.modelo;

public interface ClienteFinanciavel {

	public static final double JUROS_ALTO_RISCO = 2.0;
	//public static final  está implícito, pois é uma interface.
	double JUROS_MEDIO_RISCO = 1.5;
	double JUROS_BAIXO_RISCO = 1.0;
	
	double calcularLimiteAprovado();



	default double calcularTaxaJuros(double valorSolicitado) {
		if (isFinanciamentoPequenoValor(valorSolicitado)) {
			return JUROS_BAIXO_RISCO;
		} else if (isFinanciamentoMedioValor(valorSolicitado)) {
			return JUROS_MEDIO_RISCO;
		}
		// Grande valor.
		return JUROS_ALTO_RISCO;
	}



	static boolean isFinanciamentoMedioValor(double valorSolicitado) {
		return valorSolicitado > 100_000 && valorSolicitado <= 1_000_000;
	}



	static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
		return valorSolicitado <= 100_000;
	}

}
