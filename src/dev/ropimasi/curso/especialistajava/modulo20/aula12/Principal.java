package dev.ropimasi.curso.especialistajava.modulo20.aula12;

public class Principal {

	public static void main(String[] args) {
		
		long tempoInicio = System.currentTimeMillis();
		
//		String texto = "";
		StringBuilder sb = new StringBuilder(101_000);
		
		for (int i = 0; i < 100_000; i++) {
//			texto += "#";
			sb.append("#");
		}

		long tempoFim = System.currentTimeMillis();
		
		System.out.println("Tempo gasto: " + (tempoFim - tempoInicio) + " ms");
	}

}
