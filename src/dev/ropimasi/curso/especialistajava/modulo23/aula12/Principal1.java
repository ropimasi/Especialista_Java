package dev.ropimasi.curso.especialistajava.modulo23.aula12;

import java.time.LocalDateTime;



public class Principal1 {

	public static void main(String[] args) {

		LocalDateTime dataHoraAtual = LocalDateTime.now();
		LocalDateTime dataHoraCalculada1 = dataHoraAtual.minusWeeks(1);

		System.out.println("Data e hora atual: " + dataHoraAtual);
		System.out.println("Data e hora calculada1: " + dataHoraCalculada1);

		LocalDateTime dataHoraCalculada2 = dataHoraCalculada1.plusWeeks(1)
				.plusHours(1)
				.plusMinutes(30);
		
		System.out.println("Data e hora calculada2: " + dataHoraCalculada2);
		
	}

}
