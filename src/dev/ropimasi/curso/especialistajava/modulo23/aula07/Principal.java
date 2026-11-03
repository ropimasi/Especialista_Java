package dev.ropimasi.curso.especialistajava.modulo23.aula07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);
		
		DateTimeFormatter formatador = DateTimeFormatter.ISO_DATE;
		System.out.println(formatador.format(dataHora));
		
		formatador = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(formatador.format(dataHora));
		
//		formatador = DateTimeFormatter.ISO_INSTANT;
//		System.out.println(formatador.format(dataHora)); // Exception porque LocalDateTime não tem fuso horário.
		
		formatador = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(formatador.format(dataHora));
		
		formatador = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		System.out.println(formatador.format(dataHora));
		
		formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(dataHora));
		System.out.println(dataHora.format(formatador)); // Chamada alternativa.
		
		formatador = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT);
		System.out.println(formatador.format(dataHora));

		formatador = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT)
				.withLocale(new Locale("pt", "BR"));
		System.out.println(formatador.format(dataHora));
		
		formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss");
		System.out.println(dataHora.format(formatador));
		
	}

}
