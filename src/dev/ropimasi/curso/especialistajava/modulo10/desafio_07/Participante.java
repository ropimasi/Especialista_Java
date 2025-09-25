package dev.ropimasi.curso.especialistajava.modulo10.desafio_07;

import java.util.Objects;




public class Participante {

	String nome;
	int saldoDePontos;



	Participante(String nome) {
		this(nome, 0);
	}



	Participante(String nome, int saldoDePontos) {
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
}
