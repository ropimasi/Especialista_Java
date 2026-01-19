package dev.ropimasi.curso.especialistajava.modulo16.aula14;

import java.util.Scanner;
import dev.ropimasi.curso.especialistajava.modulo16.aula14.estoque.BaixaEstoqueException;
import dev.ropimasi.curso.especialistajava.modulo16.aula14.estoque.Produto;
import dev.ropimasi.curso.especialistajava.modulo16.aula14.estoque.ProdutoException;




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
			} catch (BaixaEstoqueException e) {
				System.out.println("Erro na compra: " + e.getCause().getMessage());
//				e.printStackTrace();
			}

		} while (true);

		sc.close();
	}



	private static void efetuarBaixaEstoque(Produto produto, int quantidade) throws BaixaEstoqueException {

		try {
			produto.retirarEstoque(quantidade);
			System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n", quantidade,
					produto.getQuantidadeEstoque());
		} catch (IllegalArgumentException e) {
			throw new BaixaEstoqueException("Erro ao realizar baixa no estoque.", e);
			
		} catch (ProdutoException e) {
			throw new BaixaEstoqueException("Erro ao realizar baixa no estoque.", e);
		}

	}
}
