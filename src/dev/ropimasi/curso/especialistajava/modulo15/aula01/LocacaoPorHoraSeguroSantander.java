package dev.ropimasi.curso.especialistajava.modulo15.aula01;

public class LocacaoPorHoraSeguroSantander extends LocacaoPorHora {

	public LocacaoPorHoraSeguroSantander(Notebook notebook) {
		super(notebook);
	}



	@Override
	public double calcularValorDevido(int horasUtilizadas) {
		double valorTotal = super.calcularValorDevido(horasUtilizadas);
		valorTotal += (horasUtilizadas * 0.50) + (valorTotal * 0.05);
		return valorTotal;
	}

}
