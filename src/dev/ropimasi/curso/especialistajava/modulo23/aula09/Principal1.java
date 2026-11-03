package dev.ropimasi.curso.especialistajava.modulo23.aula09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;



public class Principal1 {

	private static final Scanner scanner = new Scanner(System.in);
	private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final DateTimeFormatter FORMATADOR_HORA = DateTimeFormatter.ofPattern("HH:mm");
	private static final DateTimeFormatter FORMATADOR_COMPLETO_BRASIL = DateTimeFormatter
			.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).withLocale(new Locale("pt", "BR"));


	public static void main(String[] args) {

		LocalDate dataEvento = requisitarDataEvento("Data do evento (dd/MM/yyyy): ");
		LocalTime horaEvento = requisitarHoraEvento("Hora do evento (HH:mm): ");

		//		LocalDateTime dataHoraEvento = LocalDateTime.of(dataEvento, horaEvento);
		LocalDateTime dataHoraEvento = dataEvento.atTime(horaEvento);

		System.out.println("Evento agendado para " + dataHoraEvento.format(FORMATADOR_COMPLETO_BRASIL));

	}


	private static LocalDate requisitarDataEvento(String msg) {
		while (true) {
			System.out.print(msg);
			String dataEventoStr = scanner.nextLine();
			try {
				return LocalDate.parse(dataEventoStr, FORMATADOR_DATA);
			} catch (Exception e) {
				System.out.println("Data inválida.");
			}
		}
	}


	private static LocalTime requisitarHoraEvento(String msg) {
		while (true) {
			System.out.print(msg);
			String horaEventoStr = scanner.nextLine();
			try {
				return LocalTime.parse(horaEventoStr, FORMATADOR_HORA);
			} catch (Exception e) {
				System.out.println("Hora inválida.");
			}
		}
	}

}
