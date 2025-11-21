package dev.ropimasi.curso.especialistajava.modulo15.aula02;

public class Notebook {

	private String descricao;
	private double precoPorHora;
	private double precoPorDia;



	public Notebook(String descricao, double precoPorHora, double precoPorDia) {
		super();
		this.descricao = descricao;
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getPrecoPorHora() {
		return precoPorHora;
	}



	public void setPrecoPorHora(double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}



	public double getPrecoPorDia() {
		return precoPorDia;
	}



	public void setPrecoPorDia(double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}

}
