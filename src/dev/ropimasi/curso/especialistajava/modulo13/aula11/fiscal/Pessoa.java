package dev.ropimasi.curso.especialistajava.modulo13.aula11.fiscal;

public abstract class Pessoa {

	private String nome;



	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}



	public abstract double calcularImpostos();

}
