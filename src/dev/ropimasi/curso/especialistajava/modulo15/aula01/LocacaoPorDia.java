package dev.ropimasi.curso.especialistajava.modulo15.aula01;

public class LocacaoPorDia extends Locacao {

	public LocacaoPorDia(Notebook notebook) {
		super(notebook);
	}



	@Override
	public double calcularValorDevido(int horasUtilizadas) {
		double dias = Math.ceil(horasUtilizadas / 24.0d);
		return getNoteBook().getPrecoPorDia() * dias;
	}

}
