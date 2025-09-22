package dev.ropimasi.curso.especialistajava.modulo08.desafio_10;

import java.util.Arrays;




public class Cardapio {

	ItemCardapio[] itens = new ItemCardapio[0];



	void adicionarItem(ItemCardapio item) {
		this.itens = Arrays.copyOf(itens, itens.length + 1);
		this.itens[itens.length - 1] = item;
	}



	void removerItem(int indice) {
		ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];

		System.arraycopy(this.itens, 0, novosItens, 0, indice);
		System.arraycopy(this.itens, indice + 1, novosItens, indice, novosItens.length - indice);
		
		this.itens = novosItens;
	}



	void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
		for (ItemCardapio item : itens) {
			if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
				System.out.println(item.descricao + " - R$ " + item.preco);
			}
		}
	}

}