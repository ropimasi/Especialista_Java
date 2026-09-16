package dev.ropimasi.curso.especialistajava.modulo19.aula05;

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
}
