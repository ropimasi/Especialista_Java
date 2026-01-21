package dev.ropimasi.curso.especialistajava.modulo17.aula04;

import dev.ropimasi.curso.especialistajava.modulo17.aula04.estruturadedados.Pilha;
import dev.ropimasi.curso.especialistajava.modulo17.aula04.loja.Produto;




public class Principal {

	public static void main(String[] args) {
		Pilha<Produto> pilha = new Pilha<>();
		//        pilha.colocar("A");
		//        pilha.colocar("B");
		pilha.colocar(new Produto("Arroz"));
		pilha.colocar(new Produto("Feijão"));

		Produto produto = pilha.retirar();
		System.out.println(produto.getDescricao());

		produto = pilha.retirar();
		System.out.println(produto.getDescricao());

		//        produto = pilha.retirar();
	}

}