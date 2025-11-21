package dev.ropimasi.curso.especialistajava.modulo15.aula02;

public class Principal {

	public static void main(String[] args) {
		Notebook notebook = new Notebook("Macbook Pro i7 16Gb", 5d, 100d);
		
		Precificacao precificacao = new PrecificacaoPorHora();
		Locacao locacao = new Locacao(notebook, precificacao);
		double valorDevido = locacao.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);

		precificacao = new PrecificacaoPorDia();
		locacao = new Locacao(notebook, precificacao);
		valorDevido = locacao.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);

		Seguro seguro = new SeguroSantander();
		precificacao = new PrecificacaoPorDia();
		locacao = new Locacao(notebook, precificacao, seguro);
		valorDevido = locacao.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);

		seguro = new SeguroItau();
		precificacao = new PrecificacaoPorDia();
		locacao = new Locacao(notebook, precificacao, seguro);
		valorDevido = locacao.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);

	}

}
