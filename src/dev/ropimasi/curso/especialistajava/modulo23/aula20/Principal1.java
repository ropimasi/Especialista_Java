package dev.ropimasi.curso.especialistajava.modulo23.aula20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal1 {

	public static void main(String[] args) {
		DayOfWeek diaDaSemana1 = DayOfWeek.MONDAY;
		System.out.println("Dia da semana1: " + diaDaSemana1);
		
		DayOfWeek diaDaSemana2 = DayOfWeek.of(1);
		System.out.println("Dia da semana2: " + diaDaSemana2);
		
		DayOfWeek diaDaSemana3 = DayOfWeek.valueOf("FRIDAY"); // Tem que ser uppercase.
		System.out.println("Dia da semana3: " + diaDaSemana3);
		
		DayOfWeek diaDaSemana4 = DayOfWeek.from(LocalDate.now());
		System.out.println("Dia da semana4: " + diaDaSemana4);
		
		DayOfWeek diaDaSemana5 = LocalDate.now().getDayOfWeek();
		System.out.println("Dia da semana5: " + diaDaSemana5);
		
		System.out.println("Ordinal do dia da semana1: " + diaDaSemana1.ordinal());
		System.out.println("Ordinal do dia da semana3: " + diaDaSemana3.ordinal());
		
		System.out.println("'name' do dia da semana1: " + diaDaSemana1.name());
		System.out.println("'display name' do dia da semana1: " +
				diaDaSemana1.getDisplayName(TextStyle.FULL, Locale.getDefault()));
		System.out.println("'display name' do dia da semana1: " +
				diaDaSemana1.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));
		System.out.println("'display name' do dia da semana1: " +
				diaDaSemana1.getDisplayName(TextStyle.SHORT, new Locale("pt", "BR")));
		
		// Forma alternativa de obter o nome do dia da semana em português.
		System.out.println("Nome do dia da semana3 em português: "
				+ DateTimeFormatter.ofPattern("EEEE", new Locale("pt", "BR"))
				.format(diaDaSemana3));
		System.out.println("Nome do dia da semana3 em português: "
				+ DateTimeFormatter.ofPattern("E", new Locale("pt", "BR"))
				.format(diaDaSemana3));
	}

}
