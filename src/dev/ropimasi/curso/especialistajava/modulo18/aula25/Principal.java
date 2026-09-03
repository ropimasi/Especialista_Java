package dev.ropimasi.curso.especialistajava.modulo18.aula25;

import java.util.HashSet;
import java.util.Set;
import dev.ropimasi.curso.especialistajava.modulo18.aula25.crm.Contato;



public class Principal {

	public static void main(String[] args) {
		Set<Contato> contatos = new HashSet<>();

		Contato contato1 = new Contato("Maria", "maria@algaworks.com", 40);
		Contato contato2 = new Contato("Ana", "ana@algaworks.com", 30);
		Contato contato3 = new Contato("José", "jose@algaworks.com", 25);
		Contato contato4 = new Contato("Rosa", "rosa@algaworks.com", 50);
		Contato contato5 = new Contato("João", "joao@algaworks.com", 70);
		Contato contato6 = new Contato("Josefina", "josefina@algaworks.com", 70);
		Contato contato7 = new Contato("Josefina", "josefina@algaworks.com", 70);

		System.out.println("---");
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		contatos.add(contato5);
		System.out.println("---");
		contatos.add(contato6);
		contatos.add(null);
		System.out.println("---");
		contatos.add(contato7);

		System.out.println("---");

		System.out.println(contato1.hashCode());
		System.out.println(contato2.hashCode());
		System.out.println(contato3.hashCode());
		System.out.println(contato4.hashCode());
		System.out.println(contato5.hashCode());
		System.out.println(contato6.hashCode());
		System.out.println(contato7.hashCode());

		System.out.println("---");

		for (Contato contato : contatos) {
			System.out.println(contato);
		}

		System.out.println("---");

		boolean existeContato = contatos.contains(new Contato("Janaina", "janaina@algaworks.com", 27));
		System.out.println("Existe contato? " + existeContato);

		System.out.println("---");

		existeContato = contatos.contains(new Contato("Alaor", "alaor@algaworks.com", 37));
		System.out.println("Existe contato? " + existeContato);

	}

}
