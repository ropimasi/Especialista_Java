package dev.ropimasi.curso.especialistajava.modulo05.desafio_25;

public class FolhaPagamento1 {

	double calcularSalario(int horasNormais, int horasExtras, double valorHoraNormal, double valorHoraExtra) {

		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorHorasExtras = horasExtras * valorHoraExtra;

		return valorHorasNormais + valorHorasExtras;
	}

}
