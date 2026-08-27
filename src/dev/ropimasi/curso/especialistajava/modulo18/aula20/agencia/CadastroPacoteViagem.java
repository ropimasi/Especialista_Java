package dev.ropimasi.curso.especialistajava.modulo18.aula20.agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class CadastroPacoteViagem {

	// TODO declarar lista de pacotes de viagem aqui
	List<PacoteViagem> pacotes = new ArrayList<>();


	public void adicionar(String descricao, double precoDiaria) {
		// TODO: adicionar pacote na lista, validando antes se
		// já existe usando contains (lançar exceção)
		PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);
		if (pacotes.contains(pacote)) {
			throw new PacoteJaExisteException("Pacote já existe: " + descricao);
		}
		pacotes.add(pacote);

	}


	public List<PacoteViagem> obterTodos() {
		// TODO retornar lista de pacotes
		return pacotes;
	}


	public void ordenar() {
		// TODO ordenar pacotes pela ordem natural
		Collections.sort(pacotes);
	}


	public void ordenarPorPrecoDecrescente() {
		// TODO ordenar pacotes pelo preço (decrescente)
		//Collections.sort(pacotes, new PrecoPacotesComparator().reversed().thenComparing(Comparator.naturalOrder())); // alternativa.
		pacotes.sort(new PrecoPacotesComparator().reversed().thenComparing(Comparator.naturalOrder()));
	}


	public void removerPorDescricao(String descricao) {
		// TODO: iterar nos pacotes com Iterator e remover aqueles com descrição informada,
		// lançando exceção se nenhum pacote foi removido.

		//boolean removed = pacotes.removeIf(pacote -> pacote.getDescricao().equals(descricao)); // alternativa.

		boolean removed = false;
		Iterator<PacoteViagem> iterator = pacotes.iterator();
		while (iterator.hasNext()) {
			PacoteViagem pacote = iterator.next();
			if (pacote.getDescricao().equals(descricao)) {
				iterator.remove();
				removed = true;
				// return; // return interrompe o método, então remove apenas o primeiro pacote encontrado.
				// Se quiser remover todos os pacotes com a mesma descrição, não use return.
			}
		}

		if (!removed) {
			throw new PacoteNaoEncontradoException("Pacote não encontrado: " + descricao);
		}
	}


	public PacoteViagem buscarPorDescricao(String descricao) {
		// TODO iterar pacotes com enhanced for, localizar e retornar
		//  pacote com descrição informada (ou lançar exceção se não encontrar)
		for (PacoteViagem pacote : pacotes) {
			if (pacote.getDescricao().equals(descricao)) {
				return pacote;
			}
		}
		throw new PacoteNaoEncontradoException("Pacote não encontrado: " + descricao);
	}

}
