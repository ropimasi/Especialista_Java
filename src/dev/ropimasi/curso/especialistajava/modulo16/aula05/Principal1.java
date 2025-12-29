package dev.ropimasi.curso.especialistajava.modulo16.aula05;

import java.util.Scanner;
import dev.ropimasi.curso.especialistajava.modulo16.aula05.estoque.Produto;




public class Principal1 {
	public static void main(String[] args) {

		Produto produto = new Produto("Apple Watch");
		produto.setAtivo();
		produto.adicionarEstoque(20);

		comprar(produto);
	}



	private static void comprar(Produto produto) {
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.print("Quantidade: ");
				int quantidade = sc.nextInt();
				
				efetuarBaixaEstoque(produto, quantidade);
				System.out.println("Compra efetuada com sucesso!");
				
				break;
			} catch (IllegalArgumentException | IllegalStateException e) {
				e.printStackTrace(); // usado geralmente em ambiente dev ou debug, não em produção.
				e.printStackTrace(System.out); // alternativa de imprimir a stacktrace na saída padrão.
				System.out.println("Erro na compra: " + e.getMessage());
			}
		} while (true);

		sc.close();
	}



	private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
//		try {
			produto.retirarEstoque(quantidade);
			System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n", quantidade,
					produto.getQuantidadeEstoque());
//		} catch (IllegalArgumentException iae) {
//			System.out.println("Erro ao retirar do estoque: " + iae.getMessage());
//			throw iae;
//		}
		
	}
}
