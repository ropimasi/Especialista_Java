package dev.ropimasi.curso.especialistajava.modulo14.aula08.financeira.modelo;

public interface ClienteFinanciavel {

	double calcularLimiteAprovado();



	default double calcularTaxaJuros(double valorSolicitado) {
		if (valorSolicitado <= 100_000) {
			return 1.0;
		} else if (valorSolicitado <= 1_000_000) {
			return 1.5;
		}

		return 2.0;
	}

}
