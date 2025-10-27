package dev.ropimasi.curso.especialistajava.modulo13.aula08.fiscal;

public class NotaFiscal {

	private String descricao;
	private double valorTotal;



	public NotaFiscal(String descricao, double valorTotal) {
		super();
		this.descricao = descricao;
		this.valorTotal = valorTotal;
	}



	public String getDescricao() {
		return descricao;
	}



	public double getValorTotal() {
		return valorTotal;
	}

	
	public double calcularImpostos() {
		return 0; // a implementação será nas subclasses.
	}
	
	
	public void emitir() {
		System.out.printf("Emitindo nota fiscal de: %s%n", getDescricao());
		System.out.printf("Valor total: R$%.2f%n", getValorTotal());
		System.out.printf("Impostos: R$%.2f%n", calcularImpostos());
	}
}
