package dev.ropimasi.curso.especialistajava.modulo16.aula02;

import dev.ropimasi.curso.especialistajava.modulo16.aula02.estoque.Produto;

public class Principal1 {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Apple Watch");
		produto.adicionarEstoque(10);
		produto.setAtivo();
		
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Estoque: " + produto.getQuantidadeEstoque());
		
		//produto.retirarEstoque(-5); // Retira -5 do estoque = +5 no saldo estoque.
		produto.retirarEstoque(5);
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Estoque: " + produto.getQuantidadeEstoque());
		
		// produto.retirarEstoque(10); // Retirada 10 do estoque = -5 no saldo estoque.
		produto.retirarEstoque(3);
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Estoque: " + produto.getQuantidadeEstoque());
		
	}
}
