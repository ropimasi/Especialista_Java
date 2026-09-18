package dev.ropimasi.curso.especialistajava.modulo19.aula08;

public class Principal {

	public static void main(String[] args) {
		ServicoCancelamentoPedido servico = new ServicoCancelamentoPedido();
		
		Pedido pedido = new Pedido();
		pedido.setNomeCliente("João da Silva");
		pedido.setValorTotal(90);
		
//		servico.cancelar(pedido, true);
		servico.cancelar(pedido, TipoUsuario.CLIENTE);
		
	}

}
