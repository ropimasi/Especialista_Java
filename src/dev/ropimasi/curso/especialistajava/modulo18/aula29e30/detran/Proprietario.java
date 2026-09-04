package dev.ropimasi.curso.especialistajava.modulo18.aula29e30.detran;

import java.util.Objects;



public class Proprietario {

	private String nome;
	private String cpf;


	public Proprietario(String nome, String cpf) {
		super();
		Objects.requireNonNull(nome, "Nome não pode ser nulo");
		Objects.requireNonNull(cpf, "CPF não pode ser nulo");
		this.nome = nome;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		Objects.requireNonNull(nome, "Nome não pode ser nulo");
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		Objects.requireNonNull(cpf, "CPF não pode ser nulo");
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", cpf=" + cpf + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietario other = (Proprietario) obj;
		return Objects.equals(cpf, other.cpf);
	}

}
