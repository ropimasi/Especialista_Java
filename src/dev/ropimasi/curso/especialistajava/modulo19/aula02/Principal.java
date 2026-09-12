package dev.ropimasi.curso.especialistajava.modulo19.aula02;

public class Principal {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.setNomeCliente("João da Silva");
//		pedido.setStatus(Pedido.STATUS_ENTREGUE);
		pedido.setStatus(StatusPedido.ENTREGUE); // type-safe.
//		pedido.setOrigem(Pedido.ORIGEM_BALCAO);
		pedido.setOrigem(OrigemPedido.BALCAO); // type-safe.
		
//		System.out.println(Pedido.getDescricaoStatus(pedido.getStatus()));
		System.out.println(pedido.getStatus()); // já imprime o nome da constante do Enum.
		System.out.println(pedido.getOrigem()); // já imprime o nome da constante do Enum.

	}

}
