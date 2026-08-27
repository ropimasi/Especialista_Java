package dev.ropimasi.curso.especialistajava.modulo18.aula20.agencia;

import java.util.Objects;



public class PacoteViagem implements Comparable<PacoteViagem> {

	private String descricao;
	private double precoPorPessoa;


	public PacoteViagem(String descricao, double precoPorPessoa) {
		Objects.requireNonNull(descricao);

		if (precoPorPessoa < 0) {
			throw new IllegalArgumentException("Preço por pessoa não pode ser negativo");
		}

		this.descricao = descricao;
		this.precoPorPessoa = precoPorPessoa;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getPrecoPorPessoa() {
		return precoPorPessoa;
	}


	public void setPrecoPorPessoa(double precoPorPessoa) {
		this.precoPorPessoa = precoPorPessoa;
	}


	@Override
	public String toString() {
		return "PacoteViagem{" + "descricao='" + descricao + '\'' + ", precoPorPessoa=" + precoPorPessoa + '}';
	}


	// TODO implementar compareTo
	@Override
	public int compareTo(PacoteViagem arg0) {
		return this.descricao.compareTo(arg0.descricao);
	}


	// TODO implementar equals e hashCode
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacoteViagem other = (PacoteViagem) obj;
		return Objects.equals(descricao, other.descricao);
	}


}
