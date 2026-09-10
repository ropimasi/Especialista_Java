package dev.ropimasi.curso.especialistajava.modulo18.aula33.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Venda {

	private final Cliente cliente;
	private final List<ItemVenda> itens = new ArrayList<>();
	private double valorTotal;


	public Venda(Cliente cliente) {
		this.cliente = cliente;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public List<ItemVenda> getItens() {
		return Collections.unmodifiableList(itens);
		//        return new ArrayList<>(itens); // esta opção também funciona, mas cria uma cópia da lista, o que pode ser menos eficiente.
	}


	public void adicionarItem(ItemVenda item) {
		if (excedeLimiteDeCompra(item)) {
			throw new LimiteDeCompraExcedidoException(String.format("Limite atual: %.2f", cliente.getLimiteCompras()));
		}

		valorTotal += item.getValor();
		itens.add(item);
	}


	private boolean excedeLimiteDeCompra(ItemVenda item) {
		return valorTotal + item.getValor() > getCliente().getLimiteCompras();
	}

}
