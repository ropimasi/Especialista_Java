package dev.ropimasi.curso.especialistajava.modulo08.desafio_12;

public class ItemCardapio {

	String descricao;
	double preco;



	boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
		return preco >= precoMinimo && preco <= precoMaximo;
	}



	void imprimir() {
		System.out.printf("%s x R$%.2f%n", descricao, preco);
	}

}