package dev.ropimasi.curso.especialistajava.modulo23.aula24;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;



public class Principal2 {

	public static void main(String[] args) {
		// Cálculos de YearMonth:
		YearMonth anoMes1 = YearMonth.now();
		System.out.println(anoMes1);

		YearMonth anoMesFuturo1 = anoMes1.plusYears(1);
		System.out.println(anoMesFuturo1);

		YearMonth anoMesFuturo2 = anoMes1.plusMonths(1);
		System.out.println(anoMesFuturo2);

		YearMonth anoMesPassado1 = anoMes1.minus(1, ChronoUnit.YEARS);
		System.out.println(anoMesPassado1);

		YearMonth anoMesPeriodo = anoMes1.plus(Period.parse("P1Y2M"));
		System.out.println(anoMesPeriodo);

		long tempoMeses1 = anoMesPassado1.until(anoMesFuturo2, ChronoUnit.MONTHS);
		System.out.println(tempoMeses1);
		
		long tempoMeses2 = anoMesPassado1.until(LocalDate.now(), ChronoUnit.MONTHS);
		System.out.println(tempoMeses2);

	}

}
