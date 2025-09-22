package dev.ropimasi.curso.especialistajava.modulo08.desafio_10;

public class Calendario {

	static String obterNomeMes(int numeroMes) {
		
		if (numeroMes < 0 || numeroMes > 11) {
			throw new IllegalArgumentException("Número do mês inválido: " + numeroMes);
		}
		
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		
		return meses[numeroMes];
	}



	public static void main(String[] args) {
		String mes = Calendario.obterNomeMes(9);

		System.out.println(mes);
	}

}