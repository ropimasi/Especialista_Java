package dev.ropimasi.curso.especialistajava.modulo23.aula27;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AgendaReuniao {
	
	private static final DateTimeFormatter FORMATADOR_MES_DE_ANO =
			DateTimeFormatter.ofPattern("MMMM 'de' yyyy", Locale.of("pt", "BR"));
	
	private static final DateTimeFormatter FORMATADOR_DATA_COMPLETA = DateTimeFormatter
            .ofLocalizedDate(FormatStyle.FULL)
            .withLocale(Locale.of("pt", "BR"));
	// Semelhante a formatação -> DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy", Locale.of("pt", "BR"))
	
	private static final Scanner SCANNER = new Scanner(System.in);

	private static final int MENOR_ANO = 1;
	private static final int MAIOR_ANO = 3000;
	private static final int MENOR_MES = 1;
	private static final int MAIOR_MES = 12;

	

	public static void main(String[] args) {
		Year ano = solicitarAno();
		Month mesInicial = solicitarMes();
		Month mesFinal = Month.DECEMBER;
		
		imprimirListaDeDatasReunioes(ano, mesInicial, mesFinal);
	}

	private static void imprimirListaDeDatasReunioes(Year ano, Month mesInicial, Month mesFinal) {
		YearMonth anoMesInicial = ano.atMonth(mesInicial.getValue());
		System.out.printf("Gerando agenda anual de reuniões desde %s...%n", anoMesInicial.format(FORMATADOR_MES_DE_ANO));
		
		LocalDate dataReuniaoPonteiro;
		
		for (int mesPonteiro = mesInicial.getValue();
				mesPonteiro <= mesFinal.getValue();
				mesPonteiro++) {
			
			dataReuniaoPonteiro = anoMesInicial
					.withMonth(mesPonteiro)
					.atDay(1)
					.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

			System.out.println(dataReuniaoPonteiro
					.format(FORMATADOR_DATA_COMPLETA));
		}
	}

	private static Month solicitarMes() {
		while (true) {
			System.out.print("Digite o mês inicial (de "+ MENOR_MES +" a "+ MAIOR_MES +"): ");
			
			try {
				int mesInicial = SCANNER.nextInt();
				
				if (mesInicial >= MENOR_MES && mesInicial <= MAIOR_MES) {
					return Month.of(mesInicial);
				}
				
				System.out.println("Digitou número do ano inválido.");
				
			} catch (InputMismatchException e) {
				System.out.println("Digitou número do mês inválido.");
				SCANNER.next(); // Limpa o token inválido do buffer do scanner para evitar loop infinito
			}
			
		}
	}

	private static Year solicitarAno() {
		while (true) {
			System.out.print("Digite o ano (de "+ MENOR_ANO +" a "+ MAIOR_ANO +"): ");
			
			try {
				int anoPraLista = SCANNER.nextInt();
				
				if (anoPraLista >= MENOR_ANO && anoPraLista <= MAIOR_ANO) {
					return Year.of(anoPraLista);
				}
				
				System.out.println("Digitou número do ano inválido.");
				
			} catch (InputMismatchException e) {
				System.out.println("Digitou número do ano inválido.");
				SCANNER.next(); // Limpa o token inválido do buffer do scanner para evitar loop infinito
			}
			
		}
	}

}
