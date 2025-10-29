package dev.ropimasi.curso.especialistajava.modulo14.aula02.pagamento;

public class Beneficiario {

	private String nome;
	private String chavePix;
	private String contaBancaria;



	public Beneficiario(String nome, String chavePix, String contaBancaria) {
		super();
		this.nome = nome;
		this.chavePix = chavePix;
		this.contaBancaria = contaBancaria;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getChavePix() {
		return chavePix;
	}



	public void setChavePix(String chavvePix) {
		this.chavePix = chavvePix;
	}



	public String getContaBancaria() {
		return contaBancaria;
	}



	public void setContaBancaria(String contaBancaria) {
		this.contaBancaria = contaBancaria;
	}



	public boolean naoPossuiChavePix() {
		return this.chavePix == null || this.chavePix.isBlank();
	}



	public boolean naoPossuiContaBancaria() {
		return this.contaBancaria == null || this.contaBancaria.isBlank();
	}
}
