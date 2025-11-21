package dev.ropimasi.curso.especialistajava.modulo15.aula02;

public class PrecificacaoPorHora implements Precificacao {

	@Override
	public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
		return notebook.getPrecoPorHora() * horasUtilizadas;
	}

}
