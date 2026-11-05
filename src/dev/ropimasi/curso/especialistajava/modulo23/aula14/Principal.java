package dev.ropimasi.curso.especialistajava.modulo23.aula14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Principal {

	// Formatador de LocalDate para dd/MM/yyyy que será usado em todo prorgrama.
	private static final DateTimeFormatter FORMATTER_DDMMYYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			LocalDate primeiraParcela = null;
			while (primeiraParcela == null) {
				primeiraParcela = obterDataPrimeiraParcela(scanner);
			}
		
			int quantidadeParcelas = 0;
			while (quantidadeParcelas < 1 || quantidadeParcelas > 300) {
				quantidadeParcelas = obterQuantidadeParcelas(scanner);
			}
			
			CalculadoraParcelas calculadora = new CalculadoraParcelas();
			List<LocalDate> datasParcelas = calculadora.calcular(primeiraParcela, quantidadeParcelas);
			
			imprimirParcelas(datasParcelas);
		} catch (Exception e) {
			System.out.println("Erro ao processar a data: " + e.getMessage());
		}
	}

	
	private static void imprimirParcelas(List<LocalDate> datasParcelas) {
		System.out.println("Parcelas:");
		//datasParcelas.stream().forEach(data -> System.out.println(data.format(FORMATTER_DDMMYYYY)));
		for (int i = 1; i <= datasParcelas.size(); i++) {
			LocalDate dataParcela = datasParcelas.get(i - 1);
			System.out.println("Parcela #" + i + ": " + dataParcela.format(FORMATTER_DDMMYYYY));
		}
		
	}


	private static LocalDate obterDataPrimeiraParcela(Scanner scanner) {
		System.out.print("Digite a data da primeira parcela (dd/MM/yyyy): ");
		String dataStr = scanner.nextLine();
		try {
			return LocalDate.parse(dataStr, FORMATTER_DDMMYYYY);
		} catch (Exception e) {
			System.out.println("Data inválida.");
			return null;
		}
	}
	
	

	private static int obterQuantidadeParcelas(Scanner scanner) {
		System.out.print("Digite a quantidade de parcelas (1 a 300): ");
		if (scanner.hasNextInt()) {
			int quantidade = scanner.nextInt();
			scanner.nextLine(); // Limpa o buffer do scanner.
			if ((quantidade < 1) || (quantidade > 300)) {
				System.out.println("Quantidade inválida.");
				return 0;
			}
			return quantidade;
		} else {
			System.out.println("Entrada inválida.");
			scanner.next(); // Limpa a entrada inválida
			return 0;
		}
	}

	
}
