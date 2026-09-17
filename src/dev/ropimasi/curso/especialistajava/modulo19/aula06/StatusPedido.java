package dev.ropimasi.curso.especialistajava.modulo19.aula06;

public enum StatusPedido {

	RASCUNHO,
	EMITIDO(12),
	FATURADO(10),
	SEPARADO(8),
	DESPACHADO(6),
	ENTREGUE(0),
	CANCELADO;


	private Integer tempoEntregaEmHoras;


	private StatusPedido() { // construtor é sempre private.
	}


	private StatusPedido(int tempoEntregaEmHoras) {
		this.tempoEntregaEmHoras = tempoEntregaEmHoras;
	}


	public Integer getTempoEntregaEmHoras() {
		return tempoEntregaEmHoras;
	}


	public boolean podeMudarParaCancelado(double valorPedido) {
		return this == RASCUNHO || this == EMITIDO && valorPedido < 100;
	}


	public boolean podeMudarParaEmitido() {
		return this == RASCUNHO;
	}


	public boolean podeMudarParaFaturado() {
		return this == EMITIDO;
	}
}
