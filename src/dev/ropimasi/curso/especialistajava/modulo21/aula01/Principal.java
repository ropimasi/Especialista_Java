package dev.ropimasi.curso.especialistajava.modulo21.aula01;

public class Principal {

	public static void main(String[] args) {
		
		int x = 127;
		int y = 127;
		
		Integer a = 127;
		Integer b = 127;
		
		System.out.println(x == y); // true
		System.out.println(a == b); // true
		
		x = 128;
		y = 128;
		
		a = 128;
		b = 128;
		
		System.out.println(x == y); // true
		System.out.println(a == b); // false
		
		System.out.println(x == y); // true
		System.out.println(a.equals(b)); // true
		
	}

}
