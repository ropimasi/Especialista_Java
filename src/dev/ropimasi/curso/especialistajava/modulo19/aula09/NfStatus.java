package dev.ropimasi.curso.especialistajava.modulo19.aula09;

public enum NfStatus {

	NAO_EMITIDA("Não emitida") {
		@Override
		public boolean podeCancelar(NotaFiscal notaFiscal) {
			return true;
		}


		@Override
		public boolean podeEmitir(NotaFiscal notaFiscal) {
			return true;
		}
	},
	EMITIDA("Emitida") {
		@Override
		public boolean podeCancelar(NotaFiscal notaFiscal) {
			return (notaFiscal.getValor() < 1_000);
		}


		@Override
		public boolean podeEmitir(NotaFiscal notaFiscal) {
			return false;
		}
	},
	CANCELADA("Cancelada") {
		@Override
		public boolean podeCancelar(NotaFiscal notaFiscal) {
			return false;
		}


		@Override
		public boolean podeEmitir(NotaFiscal notaFiscal) {
			return false;
		}
	};


	private String descricao;


	private NfStatus(String descricaoCompleta) {
		this.descricao = descricaoCompleta;
	}


	public String getDescricao() {
		return descricao;
	}


	public abstract boolean podeCancelar(NotaFiscal notaFiscal);

	public abstract boolean podeEmitir(NotaFiscal notaFiscal);

}
/*


if (notaFiscal.getValor() >= 1_000 || status == STATUS_CANCELADA) {
throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
}


*/