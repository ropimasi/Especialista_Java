package dev.ropimasi.curso.especialistajava.modulo16.aula06.estoque;

import java.util.Objects;

public class Produto {

	private String nome;
	private int quantidadeEstoque;
	private boolean ativo;



	public Produto(String nome) {
		super();
		setNome(nome);
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		/*if (nome == null || nome.trim().isEmpty()) {
			throw new NullPointerException("Nome do produto não pode ser nulo ou vazio.");
		}*/
		Objects.requireNonNull(nome, "Nome do produto não pode ser nulo.");
		this.nome = nome;
	}



	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}



	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}



	public boolean isAtivo() {
		return ativo;
	}



	public boolean isInativo() {
		return !ativo;
	}



	public void setAtivo() {
		this.ativo = true;
	}



	public void setInativo() {
		this.ativo = false;
	}



	public void adicionarEstoque(int quantidade) {
		this.quantidadeEstoque += quantidade;
	}



	public void retirarEstoque(int quantidade) {
		if (quantidade < 0) {
			throw new IllegalArgumentException(
					"Quantidade não pode ser negativa para retirada de estoque: " + quantidade);
		}

		if (isInativo()) {
			throw new IllegalStateException(
					"Retirada no estoque não pode ser realizada em produto inativo: " + getNome());
		}

		if (getQuantidadeEstoque() - quantidade < 0) {
			throw new IllegalStateException(
					"Quantidade em estoque insuficiente para retirada. Estoque atual: "
					+ getQuantidadeEstoque() + ", Quantidade solicitada: " + quantidade);
		}
		
		this.quantidadeEstoque -= quantidade;
	}

}
