package dev.ropimasi.curso.especialistajava.modulo19.aula07;

public class Principal {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeCliente("João da Silva");
		pedido.setStatus(StatusPedido.RASCUNHO);
		
		System.out.println("Nome do cliente: " + pedido.getNomeCliente());
		System.out.println("Status do pedido: " + pedido.getStatus());
		System.out.println("Index do status do pedido: " + pedido.getStatus().ordinal());
		System.out.println("Origem do pedido: " + pedido.getOrigem());
		System.out.println("Index da origem do pedido: " + pedido.getOrigem().ordinal());
		System.out.println("---");
//		System.out.println("Tempo de entrega em horas: " + pedido.getTempoEntregaEmHoras());
		pedido.emitir();
		System.out.println("Status do pedido: " + pedido.getStatus());
		
		pedido.faturar();
		System.out.println("Status do pedido: " + pedido.getStatus());
		
		pedido.cancelar();
		System.out.println("Status do pedido: " + pedido.getStatus());
//		System.out.println("Tempo de entrega em horas: " + pedido.getTempoEntregaEmHoras());
		
	}

}
