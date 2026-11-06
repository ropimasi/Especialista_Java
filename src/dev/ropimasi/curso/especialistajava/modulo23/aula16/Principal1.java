package dev.ropimasi.curso.especialistajava.modulo23.aula16;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Principal1 {

	public static void main(String[] args) {
		LocalDate dataCompra = LocalDate.parse("2022-09-15");
		LocalDate dataEntrega = LocalDate.parse("2022-11-12");
		
		Period tempoEntrega1 = Period.between(dataCompra, dataEntrega);
		System.out.println("Tempo de entrega: " + tempoEntrega1);
		System.out.printf("Tempo de entrega: %d anos, %d meses, %d dias.%n",
				tempoEntrega1.getYears(), tempoEntrega1.getMonths(), tempoEntrega1.getDays());
		
		Period tempoEntrega2 = dataCompra.until(dataEntrega);
		System.out.println("Tempo de entrega: " + tempoEntrega2);
		System.out.printf("Tempo de entrega: %d anos, %d meses, %d dias.%n", tempoEntrega2.getYears(),
				tempoEntrega2.getMonths(), tempoEntrega2.getDays());
		
		// Calculando período entre datas com  uma determinada unidade temporal.
		// O retorno é um Long.
		long dias1 = ChronoUnit.DAYS.between(dataCompra, dataEntrega);
		System.out.println("Dias1 entre as datas: " + dias1);
		
		long dias2 = dataCompra.until(dataEntrega, ChronoUnit.DAYS);
		System.out.println("Dias2 entre as datas: " + dias2);
		
		long semanas1 = ChronoUnit.WEEKS.between(dataCompra, dataEntrega);
		System.out.println("Semanas1 entre as datas: " + semanas1);
		
		long semanas2 = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);
		System.out.println("Semanas2 entre as datas: " + semanas2);
		
	}

}
