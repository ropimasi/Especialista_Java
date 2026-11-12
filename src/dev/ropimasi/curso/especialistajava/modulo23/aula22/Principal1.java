package dev.ropimasi.curso.especialistajava.modulo23.aula22;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;



public class Principal1 {

	public static void main(String[] args) {
		// Formas de instanciar a enumeração Month:
		Month mes1 = Month.JANUARY;
		Month mes2 = Month.of(1);
		Month mes3 = Month.valueOf("JANUARY");
		Month mes4 = Month.from(mes2);
		Month mes5 = LocalDate.now().getMonth();
		System.out.println(mes1);
		System.out.println(mes2);
		System.out.println(mes3);
		System.out.println(mes4);
		System.out.println(mes5);

		// Formas de imprimir o mês formatado:
		System.out.println(mes1.getDisplayName(TextStyle.FULL, Locale.getDefault()));
		System.out.println(mes1.getDisplayName(TextStyle.SHORT, Locale.US));
		System.out.println(mes1.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));
		System.out.println("DateTimeFormatter: " + DateTimeFormatter
				.ofPattern("MMMM").withLocale(Locale.of("pt", "BR")).format(mes1));

	}

}
