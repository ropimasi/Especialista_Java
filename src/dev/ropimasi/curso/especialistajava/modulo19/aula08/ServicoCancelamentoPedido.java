package dev.ropimasi.curso.especialistajava.modulo19.aula08;

public class ServicoCancelamentoPedido {

//	public void cancelar(Pedido pedido, boolean cliente) {
	public void cancelar(Pedido pedido, TipoUsuario tipoUsuario) {
		pedido.cancelar();

//		if (cliente) {
		if (TipoUsuario.CLIENTE.equals(tipoUsuario)) {
			System.out.println("Notificando gerente sobre cancelamento do pedido.");
		}
	}
}
