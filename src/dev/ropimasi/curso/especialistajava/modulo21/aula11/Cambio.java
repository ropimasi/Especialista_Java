package dev.ropimasi.curso.especialistajava.modulo21.aula11;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;



public class Cambio {

	public static void main(String[] args) throws ParseException {

		System.out.print("Preço do produto em Dólares: ");
		Scanner scanner = new Scanner(System.in);
		String precoProdutoStr = scanner.nextLine();
		System.out.print("Preço de 1 Dólar em Real: ");
		String cotacaoDolarStr = scanner.nextLine();
		scanner.close();
		
		// Formatação de números com vírgula e ponto para notação en-US.
		DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("en", "US"));
		DecimalFormat formatador = new DecimalFormat("#,##0.00", simbolos);
		formatador.setParseBigDecimal(true);
		
		// Conversão de String para BigDecimal.
		BigDecimal precoProduto = (BigDecimal) formatador.parse(precoProdutoStr);

		// Formatação de números com vírgula e ponto para notação pt-BR.
		simbolos = new DecimalFormatSymbols(new Locale("pt", "BR"));
		formatador = new DecimalFormat("#,##0.00", simbolos);
		formatador.setParseBigDecimal(true);
		
		// Conversão de String para BigDecimal.		
		BigDecimal cotacaoDolar = (BigDecimal) formatador.parse(cotacaoDolarStr);
		
		// Cálculo do preço do produto em Real.
		BigDecimal precoProdutoEmReal = precoProduto.multiply(cotacaoDolar);
		
		// Impressão do resultado em R$.
		formatador = new DecimalFormat("R$ #,##0.00", simbolos);
		System.out.println("Preço do produto em Real: " + formatador.format(precoProdutoEmReal));
		
		NumberFormat formatador2 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		System.out.println("Preço do produto em Real: " + formatador2.format(precoProdutoEmReal));
		
	}

}
