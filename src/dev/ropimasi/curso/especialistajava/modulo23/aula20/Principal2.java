package dev.ropimasi.curso.especialistajava.modulo23.aula20;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Principal2 {

	public static void main(String[] args) {
		DayOfWeek diaDaSemana1 = LocalDate.now().getDayOfWeek();
		
		DayOfWeek diaDaSemanaQuinzeDias1 = diaDaSemana1.plus(15);
		DayOfWeek diaDaSemanaQuinzeDias2 = LocalDate.now().plusDays(15).getDayOfWeek();
		
		System.out.println("Dia da semana atual: " + diaDaSemana1);
		System.out.println("Dia da semana daqui a 15 dias (DayOfWeek): " + diaDaSemanaQuinzeDias1);
		System.out.println("Dia da semana 15 dias atras (LocalDate): " + diaDaSemanaQuinzeDias2);
		
	}

}
