package dev.ropimasi.curso.especialistajava.modulo15.aula02;

public class SeguroItau implements Seguro {

	@Override
	public double calcularPremio(int horasUtilizadas, double valorContrato) {
		double dias = Math.ceil(horasUtilizadas / 24d);
		return dias * 5;
	}

}
