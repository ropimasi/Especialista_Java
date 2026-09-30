package dev.ropimasi.curso.especialistajava.modulo20.aula11;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {

		String html = "joao@algaworks.com";
		
		System.out.println("\n" + html + "\n");
		
		String[] partes = html.split("[@.]");
		
		System.out.println(Arrays.toString(partes));
	}

}
