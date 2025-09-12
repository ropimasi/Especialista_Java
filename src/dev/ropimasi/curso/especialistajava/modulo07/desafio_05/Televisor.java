package dev.ropimasi.curso.especialistajava.modulo07.desafio_05;

import java.util.Objects;

public class Televisor {

	private static final int VOLUME_PADRAO = 20;
	private static final int CANAL_PADRAO = 130;
	
	Integer canal = CANAL_PADRAO;
	Integer volume = VOLUME_PADRAO;

	void mudarCanal(Integer novoCanal) {
		Objects.requireNonNull(novoCanal, "Canal não pode ser nulo!");		
		
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}

	void mudarVolume(Integer novoVolume) {
		Objects.requireNonNull(novoVolume, "Volume não pode ser nulo!");
		
		if (novoVolume.equals(volume)) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			volume = novoVolume;
			System.out.println("Volume alterado para " + volume);
		}
	}

}