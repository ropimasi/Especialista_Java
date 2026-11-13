package dev.ropimasi.curso.especialistajava.modulo23.aula24;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;



public class Principal1 {

	public static void main(String[] args) {
		// Maneiras de instanciar YearMonth:
		YearMonth ym1 = YearMonth.now();
		//		YearMonth ym2 = YearMonth.of(2023, 6);
		YearMonth ym2 = YearMonth.of(2023, Month.JUNE); // Alternativa à linha de cima.
		YearMonth ym3 = YearMonth.parse("2023-06");
		YearMonth ym4 = YearMonth.from(ym3);
		YearMonth ym5 = YearMonth.from(LocalDate.now());

		System.out.println(ym1);
		System.out.println(ym2);
		System.out.println(ym3);
		System.out.println(ym4);
		System.out.println(ym5);
		
		LocalDate ld1 = ym1.atDay(1);
		System.out.println(ld1);
		
		LocalDate dataUltimoDiaMes = ym1.atEndOfMonth();
		System.out.println(dataUltimoDiaMes);
		
	}

}
