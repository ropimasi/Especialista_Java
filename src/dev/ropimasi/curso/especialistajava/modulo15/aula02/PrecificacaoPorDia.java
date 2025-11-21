package dev.ropimasi.curso.especialistajava.modulo15.aula02;

public class PrecificacaoPorDia implements Precificacao{

	@Override
	public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
		double dias = Math.ceil(horasUtilizadas / 24d);
		return notebook.getPrecoPorDia() * dias; 
	}

}
