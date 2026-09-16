package dev.ropimasi.curso.especialistajava.modulo19.aula05;

public class Pedido {

	public static final int ORIGEM_BALCAO = 100;
	public static final int ORIGEM_ONLINE = 101;

	private String nomeCliente;
	private StatusPedido status = StatusPedido.RASCUNHO;
	private OrigemPedido origem = OrigemPedido.BALCAO;


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
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
//		return switch (this.status) {
//			case EMITIDO -> 12;
//			case FATURADO -> 10;
//			case SEPARADO -> 8;
//			case DESPACHADO -> 6;
//			case ENTREGUE -> 0;
//			default -> throw new IllegalStateException("Pedido não pode ser entregue. Status inválido: " + status);
//		};
	}
	
}
