package dev.ropimasi.curso.especialistajava.modulo20.aula01e02;

public class Principal {

	public static void main(String[] args) {

		String nome1 = "João";
		String nome2 = "João";
		System.out.println(nome1 + " , " + nome2); // true
		System.out.println(nome1 == nome2); // true
		System.out.println(nome1.equals(nome2)); // true
		
		String nome3 = "Pedro";
		String nome4 = new String("Pedro");
		System.out.println(nome3 + " , " + nome4); // true
		System.out.println(nome3 == nome4); // false
		System.out.println(nome3.equals(nome4)); // true
		
		nome2 = "Maria";
		System.out.println(nome1 + " , " + nome2); // true
		System.out.println(nome1 == nome2); // false
		System.out.println(nome1.equals(nome2)); // false
		
		
		
	}

}
