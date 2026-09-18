package dev.ropimasi.curso.especialistajava.modulo19.aula08;

public enum StatusPedido {

	RASCUNHO {
		@Override
		public boolean podeMudarParaCancelado(double valorPedido) {
			return true;
		}
	},
	EMITIDO(12) {
		@Override
		public boolean podeMudarParaCancelado(double valorPedido) {
			return (valorPedido < 100);
		}
	},
	FATURADO(10) {
		@Override
		public boolean podeMudarParaCancelado(double valorPedido) {
			return false;
		}
	},
	SEPARADO(8) {
		@Override
		public boolean podeMudarParaCancelado(double valorPedido) {
			return false;
		}
	},
	DESPACHADO(6) {
		@Override
		public boolean podeMudarParaCancelado(double valorPedido) {
			return false;
		}
	},
	ENTREGUE(0) {
		@Override
		public boolean podeMudarParaCancelado(double valorPedido) {
			return false;
		}
	},
	CANCELADO {
		@Override
		public boolean podeMudarParaCancelado(double valorPedido) {
			return false;
		}
	};


	private Integer tempoEntregaEmHoras;


	private StatusPedido() { // construtor é sempre private.
	}


	private StatusPedido(int tempoEntregaEmHoras) {
		this.tempoEntregaEmHoras = tempoEntregaEmHoras;
	}


	public Integer getTempoEntregaEmHoras() {
		return tempoEntregaEmHoras;
	}


	public abstract boolean podeMudarParaCancelado(double valorPedido);


	public boolean podeMudarParaEmitido() {
		return this == RASCUNHO;
	}


	public boolean podeMudarParaFaturado() {
		return this == EMITIDO;
	}
}
