package dev.ropimasi.curso.especialistajava.modulo22.aula10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {

	private static final SimpleDateFormat FORMATADOR = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Date primeiraParcela = null;
			while (primeiraParcela == null) {
				primeiraParcela = obterDataPrimeiraParcela(scanner);
			}			
			
			int quantidadeParcelas = obterQuantidadeParcelas(scanner);
			
			List<Date> datasParcelas = GeradorParcelas.gerarParcelas(primeiraParcela, quantidadeParcelas);
			
			imprimirParcelas(datasParcelas);
		} catch (ParseException e) {
			System.out.println("Erro ao processar a data: " + e.getMessage());
			//e.printStackTrace();
		}
	}
	
	private static Date obterDataPrimeiraParcela(Scanner scanner) {
        System.out.print("Digite a data da primeira parcela (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();
        try {
        	return FORMATADOR.parse(dataStr);
        } catch (ParseException e) {
        	System.out.print("Data inválida. Por favor, digite novamente no formato dd/MM/yyyy: ");
        	return null;
        }
	}
	
	private static int obterQuantidadeParcelas(Scanner scanner) {
		int quantidade = 0;
		while (quantidade < 1 || quantidade > 120) {
			System.out.print("Digite a quantidade de parcelas (1 a 120): ");
			
			if (scanner.hasNextInt()) {
				quantidade = scanner.nextInt();
				scanner.nextLine(); // Limpa o buffer do scanner.
				if ((quantidade < 1) || (quantidade > 120)) {
					System.out.println("Quantidade inválida. Por favor, digite um número entre 1 e 120.");
				}
			} else {
				System.out.println("Entrada inválida. Por favor, digite um número inteiro (1 a 120).");
				scanner.next(); // Limpa a entrada inválida
			}
		}
		return quantidade;
	}
	
	private static void imprimirParcelas(List<Date> datasParcelas) {
		System.out.println("Datas das parcelas:");
        for (int i = 0; i < datasParcelas.size(); i++) {
            String dataFormatada = FORMATADOR.format(datasParcelas.get(i));
            System.out.println("Parcela #" + (i + 1) + ": " + dataFormatada);
        }
	}
	
}
