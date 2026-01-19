package dev.ropimasi.curso.especialistajava.modulo16.aula09;

import java.util.Scanner;
import dev.ropimasi.curso.especialistajava.modulo16.aula09.estoque.Produto;
import dev.ropimasi.curso.especialistajava.modulo16.aula09.estoque.ProdutoInativoException;
import dev.ropimasi.curso.especialistajava.modulo16.aula09.estoque.ProdutoSemEstoqueException;




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
			} catch (IllegalArgumentException iae) {
				iae.printStackTrace(); // usado geralmente em ambiente dev ou debug, não em produção.
				//pie.printStackTrace(System.out); // alternativa de imprimir a stacktrace na saída padrão.
				System.out.println("Erro na compra: " + iae.getMessage());
			} catch (ProdutoSemEstoqueException psee) {
				System.out.printf("Erro na compra: %s. Estoque disponível %d. Estoque necessário %d.%n",
						psee.getMessage(), psee.getEstoqueDisponivel(), psee.getEstoqueNecessario());
			} catch (ProdutoInativoException pie) {
				System.out.println("Erro na compra: " + pie.getMessage());
				System.out.println("Deseja ativar o produto? (true/false)");
				if (sc.nextBoolean()) {
					produto.setAtivo();
					System.out.println("Produto ativado com sucesso!");
				} else {
					System.out.println("Compra cancelada.");
					break;
				}
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
