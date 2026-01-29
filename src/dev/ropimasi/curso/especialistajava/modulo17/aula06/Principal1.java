package dev.ropimasi.curso.especialistajava.modulo17.aula06;

import dev.ropimasi.curso.especialistajava.modulo17.aula06.estruturadedados.Colecao;
import dev.ropimasi.curso.especialistajava.modulo17.aula06.estruturadedados.ColecaoVaziaException;
import dev.ropimasi.curso.especialistajava.modulo17.aula06.estruturadedados.Fila;
import dev.ropimasi.curso.especialistajava.modulo17.aula06.estruturadedados.Pilha;
import dev.ropimasi.curso.especialistajava.modulo17.aula06.loja.Produto;




public class Principal1 {

	public static void main(String[] args) {
		Colecao<Produto> produtos = new Fila<>();
		produtos.colocar(new Produto("Arroz"));
		produtos.colocar(new Produto("Feijão"));
		produtos.colocar(new Produto("Água de coco"));

		retirarTodos(produtos);

		Colecao<String> nomes = new Pilha<>();
		nomes.colocar("João");
		nomes.colocar("Maria");

		retirarTodos(nomes);
	}



	private static void retirarTodos(Colecao<?> objetos) {
		try {
			int i = 1;
			while (true) {
				Object objeto = objetos.retirar();
				System.out.printf("%d. %s%n", i, objeto);
				i++;
			}
		} catch (ColecaoVaziaException e) {
			System.out.println("Coleção de objetos esgotada");
		}
	}

}