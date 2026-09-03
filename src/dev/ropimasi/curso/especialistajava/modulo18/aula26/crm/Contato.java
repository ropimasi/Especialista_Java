package dev.ropimasi.curso.especialistajava.modulo18.aula26.crm;

import java.util.Objects;



public class Contato implements Comparable<Contato> {

	private String nome;
	private String email;
	private int idade;


	public Contato(String nome, String email, int idade) {
		Objects.requireNonNull(nome);
		Objects.requireNonNull(email);
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Contato{" + "nome='" + nome + '\'' + ", email='" + email + '\'' + ", idade=" + idade + '}';
	}


	@Override
	public boolean equals(Object o) {
		System.out.println("equals: " + this.getEmail() + " ==? " + ((Contato) o).getEmail());
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Contato contato = (Contato) o;
		return email.equals(contato.email);
	}


	@Override
	public int hashCode() {
		//return Objects.hash(email); // espalhamento mais eficiente.
		return email.charAt(0);
	}


	@Override
	public int compareTo(Contato arg0) {
		System.out.println("compareTo: " + this.getEmail() + " ==? " + arg0.getEmail());
		return getEmail().compareTo(arg0.getEmail());
	}

}
