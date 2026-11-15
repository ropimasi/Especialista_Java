package dev.ropimasi.curso.especialistajava.modulo23.aula33;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

	private static final Scanner ENTRADA = new Scanner(System.in);
	
	private static final String FORMA_DATA_STR = "dd/MM/yyyy";
	private static final String FORMA_HORA_STR = "HH:mm";
	
	private static final DateTimeFormatter FORMATADOR_DATA_ENTRADA =
			DateTimeFormatter.ofPattern(FORMA_DATA_STR);
	
	private static final DateTimeFormatter FORMATADOR_HORA_ENTRADA =
			DateTimeFormatter.ofPattern(FORMA_HORA_STR);
	
	private static final DateTimeFormatter FORMATADOR_DATA_HORA_COMPLETA =
			DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm '('zzzz')'", Locale.of("pt", "BR"));
	
	
	
	public static void main(String[] args) {
		LocalDate dataFestaLocal = solicitarData();
		LocalTime horaFestaLocal = solicitarHora();
		
		//LocalDateTime dataHoraFestaLocal = dataFestaLocal.atTime(horaFestaLocal);
		//ZonedDateTime dataHoraFestaLocalZoned = dataHoraFestaLocal
		//		.atZone(ZoneId.systemDefault());
		
		ZonedDateTime dataHoraFestaLocalZoned = ZonedDateTime.of(
		        dataFestaLocal,
		        horaFestaLocal,
		        ZoneId.systemDefault());
		
		ZonedDateTime dataHoraFestaLosAngelesZoned = dataHoraFestaLocalZoned
				.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		
		ZonedDateTime dataHoraFestaJapaoZoned = dataHoraFestaLocalZoned
				.withZoneSameInstant(ZoneId.of("Japan"));

		List<ZonedDateTime> datasHorasFusos = new ArrayList<ZonedDateTime>();
		datasHorasFusos.add(dataHoraFestaLocalZoned);
		datasHorasFusos.add(dataHoraFestaLosAngelesZoned);
		datasHorasFusos.add(dataHoraFestaJapaoZoned);
		
		imprimirDataHoraConvite(datasHorasFusos);
		
	}



	private static LocalDate solicitarData() {
		while (true) {
			System.out.print("Data local da festa ("+FORMA_DATA_STR+"): ");
			String dataLocalStr = ENTRADA.nextLine();
			try {
				LocalDate dataLocal = LocalDate.parse(dataLocalStr, FORMATADOR_DATA_ENTRADA);
				return dataLocal;
			} catch (Exception e) {
				System.out.println("Entrada inválida. Tente novamente.");
			}
		}
	}



	private static LocalTime solicitarHora() {
		while (true) {
			System.out.print("Hora local da festa ("+FORMA_HORA_STR+"): ");
			String horaLocalStr = ENTRADA.nextLine();
			try {
				LocalTime horaLocal = LocalTime.parse(horaLocalStr, FORMATADOR_HORA_ENTRADA);
				return horaLocal;
			} catch (Exception e) {
				System.out.println("Entrada inválida. Tente novamente.");
			}
		}
	}



	private static void imprimirDataHoraConvite(List<ZonedDateTime> datasHorasFusos) {
		for (ZonedDateTime dataHoraFuso : datasHorasFusos) {
			System.out.println(dataHoraFuso.format(FORMATADOR_DATA_HORA_COMPLETA));
		}
	}

}
