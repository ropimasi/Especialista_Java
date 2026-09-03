package dev.ropimasi.curso.especialistajava.modulo18.aula26;

import java.util.Set;
import java.util.TreeSet;
import dev.ropimasi.curso.especialistajava.modulo18.aula26.crm.Contato;
import dev.ropimasi.curso.especialistajava.modulo18.aula26.crm.IdadeContatoComparator;



public class Principal {

	public static void main(String[] args) {
		Set<Contato> contatos = new TreeSet<>(new IdadeContatoComparator());

		Contato contato1 = new Contato("Maria", "maria@algaworks.com", 40);
		Contato contato2 = new Contato("Ana", "ana@algaworks.com", 30);
		Contato contato3 = new Contato("José", "jose@algaworks.com", 25);
		Contato contato4 = new Contato("Rosa", "rosa@algaworks.com", 50);
		Contato contato5 = new Contato("João", "joao@algaworks.com", 70);
		Contato contato6 = new Contato("Josefina", "josefina@algaworks.com", 70);
		Contato contato7 = new Contato("Josefina", "josefina@algaworks.com", 70);
		Contato contato8 = new Contato("Maria", "maria@algaworks.com", 41);

		System.out.println("---");
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		contatos.add(contato5);
		System.out.println("---");
		contatos.add(contato6);
		//contatos.add(null); // TreeSet não adiciona null.
		System.out.println("---");
		contatos.add(contato7);
		contatos.add(contato8);

		System.out.println("---");

		for (Contato contato : contatos) {
			System.out.println(contato);
		}

	}

}
