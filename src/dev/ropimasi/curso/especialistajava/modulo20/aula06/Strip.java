package dev.ropimasi.curso.especialistajava.modulo20.aula06;

public class Strip {

	public static void main(String[] args) {
		
		String nome = "    \n        Pedro        ";
		System.out.println(">"+nome+"<");
		nome.strip();
		System.out.println(">"+nome+"<");
		
		String nomeSemEspacosEmBranco = nome.strip();
		System.out.println(">"+nomeSemEspacosEmBranco+"<");
		System.out.println(">"+nome+"<");

		System.out.println(">"+nome.stripLeading()+"<");
		System.out.println(">"+nome.stripTrailing()+"<");
		
		System.out.println(">"+nome.trim()+"<"); // legado, java <= 10.
		

	}

}
