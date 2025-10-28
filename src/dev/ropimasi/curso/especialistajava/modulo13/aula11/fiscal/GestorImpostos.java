package dev.ropimasi.curso.especialistajava.modulo13.aula11.fiscal;

public class GestorImpostos {

	private double valorTotalImpostos;



	public double getValorTotalImpostos() {
		return valorTotalImpostos;
	}



	public void adicionar(Pessoa pessoa) {
		this.valorTotalImpostos += pessoa.calcularImpostos();
		System.out.println("Adicionando imposto de: " + pessoa.getNome() + ", valor: " + pessoa.calcularImpostos());
	}
}
