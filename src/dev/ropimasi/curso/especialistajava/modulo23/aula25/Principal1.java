package dev.ropimasi.curso.especialistajava.modulo23.aula25;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;



public class Principal1 {

	public static void main(String[] args) {
		// Data de hoje.
		LocalDate hoje = LocalDate.now();
		System.out.println("Hoje: " + hoje);

		LocalDate primeiraSegundaProximoMes = hoje
				.plusMonths(1)
				.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("Primeira segunda-feira do próximo mês: " + primeiraSegundaProximoMes);

		LocalDate ultimoDiaAnoAnterior = hoje
				.minusYears(1)
				.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Último dia do ano anterior: " + ultimoDiaAnoAnterior);

		LocalDate ultimoDiaMesAnterior = hoje
				.minusMonths(1)
				.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Último dia do mês anterior: " + ultimoDiaMesAnterior);
		
		// Uma alternativa para obter o mesmo último dia do mês anterior,
		// sem usar TemporalAdjusters, seria:
		LocalDate ultimoDiaMesAnterior2 = hoje
				.minusMonths(1)
				.withDayOfMonth(hoje.minusMonths(1).lengthOfMonth());
		System.out.println("Último dia do mês anterior: " + ultimoDiaMesAnterior2);
		
		LocalDate proximaSexta = hoje
				.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("Próxima sexta-feira: " + proximaSexta);
		
		LocalDate proximaSexta2 = hoje
				.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("Próxima sexta-feira (or same): " + proximaSexta2);
		

	}

}
