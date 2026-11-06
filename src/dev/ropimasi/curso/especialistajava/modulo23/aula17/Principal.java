package dev.ropimasi.curso.especialistajava.modulo23.aula17;

import java.time.Duration;

public class Principal {

	public static void main(String[] args) {
		Duration duracao1 = Duration.ofHours(5);
		Duration duracao2 = Duration.ofDays(2);
		Duration duracao3 = Duration.ofMinutes(30);
		Duration duracao4 = Duration.parse("PT15H30M");
		Duration duracao5 = Duration.parse("P1DT5H01M01S");

		System.out.println(duracao1);
		System.out.println(duracao2);
		System.out.println(duracao3);
		System.out.println(duracao4);
		System.out.println(duracao5);
		
		Duration duracaoCalculada1 = duracao1.plus(duracao2);
		Duration duracaoCalculada2 = duracao3.minus(duracao4);
		Duration duracaoCalculada3 = duracao5.multipliedBy(2);
		Duration duracaoCalculada4 = duracao1.dividedBy(2);
		Duration duracaoCalculada5 = duracao2.plus(Duration.ofHours(3)).minus(Duration.ofMinutes(15));
		Duration duracaoCalculada6 = duracao3.plusMinutes(45).minusSeconds(30); // Métodos de conveniência.
		
		System.out.println(duracaoCalculada1);
		System.out.println(duracaoCalculada2);
		System.out.println(duracaoCalculada3);
		System.out.println(duracaoCalculada4);
		System.out.println(duracaoCalculada5);
		System.out.println(duracaoCalculada6);
		
		// Campos da duração.
		// Estes fazem a conversão para o campo solicitado, mas não retornam o valor exato da duração.
		System.out.println("Dias: " + duracao5.toDays());
		System.out.println("Horas: " + duracao5.toHours());
		System.out.println("Minutos: " + duracao5.toMinutes());
		System.out.println("Segundos: " + duracao5.getSeconds());
		System.out.println("Milissegundos: " + duracao5.toMillis());
		System.out.println("Nanosegundos: " + duracao5.toNanos());
		
		// Para pegar somente o valor do campo desejado, podemos usar os métodos toXPart() que retornam o valor do campo específico.
		System.out.println("Dias: " + duracao5.toDaysPart());
		System.out.println("Horas: " + duracao5.toHoursPart());
		System.out.println("Minutos: " + duracao5.toMinutesPart());
		System.out.println("Segundos: " + duracao5.toSecondsPart());
		System.out.println("Milissegundos: " + duracao5.toMillisPart());
		System.out.println("Nanosegundos: " + duracao5.toNanosPart());
		
		
	}

}
