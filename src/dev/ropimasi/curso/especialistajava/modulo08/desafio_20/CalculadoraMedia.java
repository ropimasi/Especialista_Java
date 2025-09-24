package dev.ropimasi.curso.especialistajava.modulo08.desafio_20;

public class CalculadoraMedia {

	public static double calcularMedia(double n1, double n2, double... numeros) {

		double soma = 0;
		soma += n1 + n2;

		for (double numero : numeros) {
			soma += numero;
		}
		return soma / (numeros.length + 2);
	}



	public static void main(String[] args) {
		System.out.println(calcularMedia(7, 8));
		System.out.println(calcularMedia(7, 8, 9));
		System.out.println(calcularMedia(7, 8, 9, 10));
		System.out.println(calcularMedia(7, 8, 9, 10, 6));
	}

}
