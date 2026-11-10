package dev.ropimasi.curso.especialistajava.modulo23.aula18;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Principal2 {

	public static void main(String[] args) {
		Duration tempoMedioEntrega = Duration.parse("PT45M");
		LocalDateTime agora = LocalDateTime.now();
		LocalDateTime dataHoraPrevistaEntrega = agora.plus(tempoMedioEntrega);
		
		System.out.println("Tempo médio de entrega: " + tempoMedioEntrega);
		System.out.println("Data e hora atual: " + agora);
		System.out.println("Data e hora prevista de entrega: " + dataHoraPrevistaEntrega);
		
		LocalDateTime dataHoraPrevistaEntregaTruncada = dataHoraPrevistaEntrega.truncatedTo(ChronoUnit.MINUTES);
		System.out.println("Data e hora prevista de entrega truncada: " + dataHoraPrevistaEntregaTruncada);
		

	}

}
