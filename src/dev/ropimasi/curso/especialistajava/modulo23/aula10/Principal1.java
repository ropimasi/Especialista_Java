package dev.ropimasi.curso.especialistajava.modulo23.aula10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;



public class Principal1 {

	public static void main(String[] args) {

		// LocalDate dataVencimento = LocalDate.of(2024, 6, 30);
		LocalDate dataVencimento = LocalDate.parse("2024-06-30");
		LocalTime horaVencimento = LocalTime.parse("18:00:00");

		System.out.println("Campo dia do mês: " + ChronoField.DAY_OF_MONTH.getFrom(dataVencimento));
		System.out.println("Dia da semana: " + ChronoField.DAY_OF_WEEK.getFrom(dataVencimento));
		System.out.println("Campo mês do ano: " + ChronoField.MONTH_OF_YEAR.getFrom(dataVencimento));
		System.out.println("Campo ano: " + ChronoField.YEAR.getFrom(dataVencimento));
		System.out.println("Campo hora do dia: " + ChronoField.HOUR_OF_DAY.getFrom(horaVencimento));
		System.out.println("Campo minuto da hora: " + ChronoField.MINUTE_OF_HOUR.getFrom(horaVencimento));
		
		System.out.println("Campo dia do mês: " + dataVencimento.getLong(ChronoField.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + dataVencimento.getLong(ChronoField.DAY_OF_WEEK));
		System.out.println("Campo mês do ano: " + dataVencimento.getLong(ChronoField.MONTH_OF_YEAR));
		System.out.println("Campo ano: " + dataVencimento.getLong(ChronoField.YEAR));
		System.out.println("Campo hora do dia: " + horaVencimento.getLong(ChronoField.HOUR_OF_DAY));
		System.out.println("Campo minuto da hora: " + horaVencimento.getLong(ChronoField.MINUTE_OF_HOUR));

	}

}
