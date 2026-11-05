package dev.ropimasi.curso.especialistajava.modulo23.aula15;

import java.time.Period;

public class Principal {

	public static void main(String[] args) {
		Period periodo1 = Period.of(1, 2, 3); // ano, mês, dia.
		Period periodo2 = Period.ofDays(10);
		Period periodo3 = Period.ofDays(56);
		Period periodo4 = Period.ofWeeks(5);
		Period periodo5 = Period.ofMonths(9);
		Period periodo6 = Period.parse("P2Y5M10D"); // P = Period, Y = Year, M = Month, D = Day.
		
		System.out.println(periodo1);
		System.out.println(periodo2);
		System.out.println(periodo3);
		System.out.println(periodo4);
		System.out.println(periodo5);

		Period periodoCalculado1 = periodo1.plus(Period.ofYears(2));
		System.out.println(periodoCalculado1);

		Period periodoCalculado2 = periodo1.plusYears(2);
		System.out.println(periodoCalculado2);
		
		Period periodoCalculado3 = periodo4.minusDays(2);
		System.out.println(periodoCalculado3);
		
		// Muito cuidado com este item: aprofundar estudo nele.
		Period periodoCalculado4 = periodo5.minus(periodo4);
		System.out.println(periodoCalculado4);
		System.out.println(periodoCalculado4.normalized());
		
		Period periodoCalculado5 = periodo6.multipliedBy(3);
		System.out.println(periodoCalculado5);
		System.out.println(periodoCalculado5.normalized());
	}

}
