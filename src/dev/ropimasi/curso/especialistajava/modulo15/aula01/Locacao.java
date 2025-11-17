package dev.ropimasi.curso.especialistajava.modulo15.aula01;

public abstract class Locacao {

	private Notebook notebook;
	
	public Locacao(Notebook notebook) { this.notebook = notebook; }
	
	public Notebook getNoteBook() { return this.notebook; }
	
	public abstract double calcularValorDevido(int horasUtilizadas);
}
