package dev.ropimasi.curso.especialistajava.modulo23.aula13;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;



public class Principal {

	public static void main(String[] args) {

		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Data e hora atual: " + agora);
		
//		LocalDateTime proximaParcela = agora.plusDays(30);
		LocalDateTime proximaParcela1 = agora.plus(30, ChronoUnit.DAYS);
		LocalDateTime proximaParcela2 = ChronoUnit.DAYS.addTo(proximaParcela1, 30);
		
		System.out.println("Próxima parcela1: " + proximaParcela1);
		System.out.println("Próxima parcela2: " + proximaParcela2);
		
		

	}

}
