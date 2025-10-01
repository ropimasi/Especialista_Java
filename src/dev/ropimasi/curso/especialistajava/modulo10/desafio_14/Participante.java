package dev.ropimasi.curso.especialistajava.modulo10.desafio_14;

import java.util.Objects;




public class Participante {

	private String nome;
	private int saldoDePontos;



	public Participante(String nome) {
		this(nome, 0);
	}



	private Participante(String nome, int saldoDePontos) {
		Objects.requireNonNull(nome, "Nome é obrigatório.");

		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome é obrigatório.");
		}

		if (saldoDePontos < 0) {
			throw new IllegalArgumentException("Saldo de pontos deve ser maior ou igual a 0.");
		}

		this.nome = nome;
		this.saldoDePontos = saldoDePontos;
	}



	public int creditarPontos(int pontos) {
		if (pontos < 0) {
			throw new IllegalArgumentException("Pontos devem ser maiores ou igual a 0.");
		}
		return this.saldoDePontos += pontos;
	}
}
