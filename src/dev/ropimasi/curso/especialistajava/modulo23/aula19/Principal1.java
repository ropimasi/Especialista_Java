package dev.ropimasi.curso.especialistajava.modulo23.aula19;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal1 {

	private static final Scanner SCANNER = new Scanner(System.in);
	private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
		// Solicitar data de nascimento do usuário.
		LocalDate dataNascimento = solicitarDataNascimento();
		
		// Calcular periodo de tempo de vida do usuário.
		LocalDate dataAtual = LocalDate.now();
//		Period periodo = Period.between(dataNascimento, dataAtual);
		Period periodo = dataNascimento.until(dataAtual); // Alternativa.
		
		
		// Exibir resultado.
		System.out.printf("Você tem %d %s, %d %s e %d %s.%n",
				periodo.getYears(),
				((periodo.getYears() == 1)?"ano":"anos"),
				periodo.getMonths(),
				((periodo.getMonths() == 1)?"mês":"meses"),
				periodo.getDays(),
				((periodo.getDays() == 1)?"dia":"dias")
				);

	}

	private static LocalDate solicitarDataNascimento( ) {
		LocalDate dataNascimento = null;
		while (dataNascimento == null) {
			System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
			String inputDataNascimento = SCANNER.nextLine();
			try {
				dataNascimento =
						LocalDate.parse(inputDataNascimento, FORMATADOR_DATA);
			} catch (Exception e) {
				System.out.println("Formato de data inválido.");
				dataNascimento = null;
			}
		}
		
		return dataNascimento;
	}

}
