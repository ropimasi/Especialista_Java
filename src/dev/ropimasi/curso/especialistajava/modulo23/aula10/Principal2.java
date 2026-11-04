package dev.ropimasi.curso.especialistajava.modulo23.aula10;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;



public class Principal2 {

	public static void main(String[] args) {

		// LocalDate dataVencimento = LocalDate.of(2024, 6, 30);
		LocalDateTime dataHoraCompra = LocalDateTime.parse("2024-06-30T21:05:54");

		// Utilizando os métodos de conveniência da classe LocalDateTime.
		System.out.println("Dia do mês: " + dataHoraCompra.getDayOfMonth());
		System.out.println("Dia da semana: " + dataHoraCompra.getDayOfWeek());
		System.out.println("Dia da semana (getLong): " + dataHoraCompra.getLong(ChronoField.DAY_OF_WEEK));
		System.out.println("Mês do ano: " + dataHoraCompra.getMonthValue());
		System.out.println("Ano: " + dataHoraCompra.getYear());
		System.out.println("Hora do dia: " + dataHoraCompra.getHour());
		System.out.println("Minuto da hora: " + dataHoraCompra.getMinute());
		System.out.println("Segundo do minuto: " + dataHoraCompra.getSecond());
	}

}
