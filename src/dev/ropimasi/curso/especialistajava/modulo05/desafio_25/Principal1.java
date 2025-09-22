package dev.ropimasi.curso.especialistajava.modulo05.desafio_25;

public class Principal1 {

	public static void main(String[] args) {
		FolhaPagamento1 folhaPagamento = new FolhaPagamento1();

		double salarioDevido = folhaPagamento.calcularSalario(160, 10, 51.8, 60.5);

		System.out.printf("Salário devido: R$ %.2f%n", salarioDevido);
	}

}
