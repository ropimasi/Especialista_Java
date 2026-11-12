package dev.ropimasi.curso.especialistajava.modulo23.aula21;

import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Principal2 {

	public static void main(String[] args) {
		// Calcular anos:
		Year ano1 = Year.of(2023);
		Year ano2 = ano1.plus(Period.parse("P5Y"));
		Year ano3 = ano1.minus(10, ChronoUnit.CENTURIES);
		Year ano4 = ano1.plusYears(5); // método de conveniência.
		Year ano5 = ano1.minusYears(10); // método de conveniência.
		System.out.println(ano1);
		System.out.println(ano2);
		System.out.println(ano3);
		System.out.println(ano4);
		System.out.println(ano5);
	}

}
