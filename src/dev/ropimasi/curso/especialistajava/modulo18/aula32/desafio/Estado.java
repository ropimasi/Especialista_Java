package dev.ropimasi.curso.especialistajava.modulo18.aula32.desafio;

import java.util.Objects;



public class Estado implements Comparable<Estado> {

	private final String sigla;
	private final String nome;


	public Estado(String sigla, String nome) {
		Objects.requireNonNull(sigla);
		Objects.requireNonNull(nome);
		this.sigla = sigla;
		this.nome = nome;
	}


	public String getSigla() {
		return sigla;
	}


	public String getNome() {
		return nome;
	}


	@Override
	public String toString() {
		return "Estado{" + "sigla='" + sigla + '\'' + ", nome='" + nome + '\'' + '}';
	}


	@Override
	public int compareTo(Estado arg0) {
		return this.sigla.compareTo(arg0.sigla);
	}

	
	
}
