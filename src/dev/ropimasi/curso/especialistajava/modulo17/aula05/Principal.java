package dev.ropimasi.curso.especialistajava.modulo17.aula05;

import dev.ropimasi.curso.especialistajava.modulo17.aula05.estruturadedados.Colecao;
import dev.ropimasi.curso.especialistajava.modulo17.aula05.estruturadedados.ColecaoVaziaException;
import dev.ropimasi.curso.especialistajava.modulo17.aula05.estruturadedados.Fila;
import dev.ropimasi.curso.especialistajava.modulo17.aula05.loja.Produto;




public class Principal {

	public static void main(String[] args) {
		Colecao<Produto> produtos = new Fila<>();
		produtos.colocar(new Produto("Arroz"));
		produtos.colocar(new Produto("Feijão"));
		produtos.colocar(new Produto("Água de coco"));

		retirarTodos(produtos);
	}



	private static void retirarTodos(Colecao<Produto> produtos) {
		try {
			int i = 1;
			while (true) {
				Produto produto = produtos.retirar();
				System.out.printf("%d. %s%n", i, produto.getDescricao());
				i++;
			}
		} catch (ColecaoVaziaException e) {
			System.out.println("Coleção de produtos esgotada");
		}
	}

}