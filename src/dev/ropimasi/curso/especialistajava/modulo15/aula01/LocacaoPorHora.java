package dev.ropimasi.curso.especialistajava.modulo15.aula01;

public class LocacaoPorHora extends Locacao {

	public LocacaoPorHora(Notebook notebook) {
		super(notebook);
	}



	@Override
	public double calcularValorDevido(int horasUtilizadas) {
		return getNoteBook().getPrecoPorHora() * horasUtilizadas;
	}

}
