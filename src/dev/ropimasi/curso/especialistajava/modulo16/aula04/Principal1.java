package dev.ropimasi.curso.especialistajava.modulo16.aula04;

import java.util.Scanner;
import dev.ropimasi.curso.especialistajava.modulo16.aula04.estoque.Produto;




public class Principal1 {
	public static void main(String[] args) {

		Produto produto = new Produto("Apple Watch");
		produto.setAtivo();
		produto.adicionarEstoque(20);

		comprar(produto);
	}



	private static void comprar(Produto produto) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();

		efetuarBaixaEstoque(produto, quantidade);
		System.out.println("Compra efetuada com sucesso!");

		sc.close();
	}



	private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
		try {
			produto.retirarEstoque(quantidade);
			System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n", quantidade,
					produto.getQuantidadeEstoque());
		} catch (IllegalArgumentException iae) {
			System.out.println("Erro ao retirar do estoque: " + iae.getMessage());			
		}
		
	}
}
