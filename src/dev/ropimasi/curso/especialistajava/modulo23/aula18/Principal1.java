package dev.ropimasi.curso.especialistajava.modulo23.aula18;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Principal1 {

	public static void main(String[] args) {
		LocalDateTime dataHoraCompra = LocalDateTime.parse("2022-11-12T21:30:00");
		LocalDateTime dataHoraEntrega = LocalDateTime.parse("2022-11-12T22:10:10");
		
		Duration tempoEntrega = Duration.between(dataHoraCompra, dataHoraEntrega);
		System.out.println("Tempo de entrega: " + tempoEntrega);
		System.out.println("Tempo de entrega (m): " + tempoEntrega.toMinutes());
		
		long tempoEntregaSegundos1 = dataHoraCompra.until(dataHoraEntrega, ChronoUnit.SECONDS);
		System.out.println("Tempo de entrega1 (s): " + tempoEntregaSegundos1);
		Long tempoEntregaSegundos2 = ChronoUnit.SECONDS.between(dataHoraCompra, dataHoraEntrega);
		System.out.println("Tempo de entrega2 (s): " + tempoEntregaSegundos2);

	}

}
