package dev.ropimasi.curso.especialistajava.modulo18.aula28;

import java.util.Objects;



public class Cidade implements Comparable<Cidade> {

	private int codigoIbge;
	private String nome;
	private int totalHabitantes;


	public Cidade(int codigoIbge, String nome, int totalHabitantes) {
		this.codigoIbge = codigoIbge;
		this.nome = nome;
		this.totalHabitantes = totalHabitantes;
	}


	public int getCodigoIbge() {
		return codigoIbge;
	}


	public void setCodigoIbge(int codigoIbge) {
		this.codigoIbge = codigoIbge;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getTotalHabitantes() {
		return totalHabitantes;
	}


	public void setTotalHabitantes(int totalHabitantes) {
		this.totalHabitantes = totalHabitantes;
	}


	@Override
	public String toString() {
		return "Cidade{" + "codigoIbge=" + codigoIbge + ", nome='" + nome + '\'' + ", totalHabitantes="
				+ totalHabitantes + '}';
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigoIbge);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return codigoIbge == other.codigoIbge;
	}


	@Override
	public int compareTo(Cidade arg0) {
		return Integer.compare(this.getCodigoIbge(), arg0.getCodigoIbge());
	}

}
