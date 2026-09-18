package dev.ropimasi.curso.especialistajava.modulo19.aula08;

public class Pedido {

	public static final int ORIGEM_BALCAO = 100;
	public static final int ORIGEM_ONLINE = 101;

	private String nomeCliente;
	private double valorTotal;
	private StatusPedido status = StatusPedido.RASCUNHO;
	private OrigemPedido origem = OrigemPedido.BALCAO;


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valor) {
		this.valorTotal = valor;
	}


	public StatusPedido getStatus() {
		return status;
	}


	public void setStatus(StatusPedido status) {
		this.status = status;
	}


	public OrigemPedido getOrigem() {
		return origem;
	}


	public void setOrigem(OrigemPedido origem) {
		this.origem = origem;
	}


	public int getTempoEntregaEmHoras() {
		return status.getTempoEntregaEmHoras();
	}


	public void cancelar() {
		if (this.getStatus().podeMudarParaCancelado(this.getValorTotal())) {
			this.status = StatusPedido.CANCELADO;
		} else {
			throw new IllegalStateException("Pedido não pode ser cancelado, pois está no status: " + status);
		}
	}


	public void emitir() {
		if (this.getStatus().podeMudarParaEmitido()) {
			this.status = StatusPedido.EMITIDO;
		} else {
			throw new IllegalStateException("Pedido não pode ser emitido, pois está no status: " + status);
		}
	}


	public void faturar() {
		if (this.getStatus().podeMudarParaFaturado()) {
			this.status = StatusPedido.FATURADO;
		} else {
			throw new IllegalStateException("Pedido não pode ser faturado, pois está no status: " + status);
		}
	}

}
