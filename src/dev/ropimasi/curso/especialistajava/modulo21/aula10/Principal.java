package dev.ropimasi.curso.especialistajava.modulo21.aula10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;



public class Principal {

	public static void main(String[] args) throws ParseException {
		String texto = "1.000,43";

		//		NumberFormat formatador = new DecimalFormat("#,##0.00"); // NumberFormat não possui o método setParseBigDecimal.
		DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR"));
		DecimalFormat formatador = new DecimalFormat("#,##0.00", simbolos);

		Number valor1 = formatador.parse(texto); // Converte para um Long. Inadequado.
		System.out.println(valor1.getClass());
		System.out.println(valor1);

		Double valor2 = formatador.parse(texto).doubleValue(); // Converte para um Long primeiramente, perde a precião. Inadequado.
		System.out.println(valor2.getClass());
		System.out.println(valor2);

		BigDecimal valor3 = new BigDecimal(formatador.parse(texto).doubleValue()); // Idem.
		System.out.println(valor3.getClass());
		System.out.println(valor3);

		formatador.setParseBigDecimal(true);
		BigDecimal valor4 = (BigDecimal) formatador.parse(texto); // Converte direto para BigDecimal, mantendo a precisão.
		System.out.println(valor4.getClass());
		System.out.println(valor4);

	}

}
