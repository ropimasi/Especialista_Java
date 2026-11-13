package dev.ropimasi.curso.especialistajava.modulo23.aula25;

import java.time.LocalDate;

public class Principal2 {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println("Hoje: " + hoje);
		
		// Alternativa sem usar TemporalAdjuster.
		LocalDate dataNatalEsteAno = hoje.withMonth(12).withDayOfMonth(25);
		System.out.println("Natal deste ano: " + dataNatalEsteAno);
		
		// Alternativa com TemporalAdjuster.
		LocalDate dataNatalEsteAno2 = hoje.with(new DataNatalEsteAnoAdjuster());
		System.out.println("Natal deste ano (com TemporalAdjuster): " + dataNatalEsteAno2);
		
	}

}
