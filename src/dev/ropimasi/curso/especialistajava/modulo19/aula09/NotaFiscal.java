package dev.ropimasi.curso.especialistajava.modulo19.aula09;

public class NotaFiscal {

	//	public static final int STATUS_NAO_EMITIDA = 0;
	//	public static final int STATUS_EMITIDA = 1;
	//	public static final int STATUS_CANCELADA = 2;

	private final Integer numero;
	private final String descricao;
	private final double valor;
	//	private int status = STATUS_NAO_EMITIDA;
	private NfStatus status = NfStatus.NAO_EMITIDA;


	public NotaFiscal(Integer numero, String descricao, double valor) {
		this.numero = numero;
		this.descricao = descricao;
		this.valor = valor;
	}


	public Integer getNumero() {
		return numero;
	}


	public String getDescricao() {
		return descricao;
	}


	public double getValor() {
		return valor;
	}


	public NfStatus getStatus() {
		return status;
	}


	public void cancelar() {
		if (this.status.podeCancelar(this)) {
			this.status = NfStatus.CANCELADA;
		} else {
			throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
		}
	}


	public void emitir() {
		if (this.status.podeEmitir(this)) {
			this.status = NfStatus.EMITIDA;
		} else {
			throw new IllegalStateException("Não foi possível emitir a nota fiscal");
		}
	}


	/*
		public String getDescricaoCompleta() {
			String descricaoStatus = switch (status) {
			case STATUS_NAO_EMITIDA -> "Não emitida";
			case STATUS_EMITIDA -> "Emitida";
			case STATUS_CANCELADA -> "Cancelada";
			default -> throw new RuntimeException("Status não tratado");
			};
	
			return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s", getNumero(), getDescricao(), getValor(),
					descricaoStatus);
		}
	*/
	public String getDescricaoCompleta() {
		return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s", getNumero(), getDescricao(), getValor(),
				getStatus().getDescricao());
	}
}
