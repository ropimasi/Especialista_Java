package dev.ropimasi.curso.especialistajava.modulo18.aula31;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import dev.ropimasi.curso.especialistajava.modulo18.aula31.detran.Carro;
import dev.ropimasi.curso.especialistajava.modulo18.aula31.detran.Proprietario;



public class Principal {

	public static void main(String[] args) {

		// Declarações:
		Proprietario maria = new Proprietario("Maria", "12345678900");
		Proprietario joao = new Proprietario("João", "98765432100");
		Proprietario ana = new Proprietario("Ana", "11122233300");
		Proprietario jose = new Proprietario("José", "33322211100");

		Carro bmw = new Carro("ALG1A23", "BMW X4");
		Carro mercedes = new Carro("WOR9K87", "Mercedes GLA");
		Carro audi = new Carro("JAV4A56", "Audi A3");
		Carro peugeot = new Carro("EJA6V54", "Peugeot 3008");

		//Map<Carro, Proprietario> carrosProprietarios = new HashMap<>();
		//Map<Carro, Proprietario> carrosProprietarios = new Hashtable<>();
		//Map<Carro, Proprietario> carrosProprietarios = new HashMap<>();
		Map<Carro, Proprietario> carrosProprietarios = new TreeMap<>();

		// Atribuições, colocações:
		carrosProprietarios.put(bmw, maria);
		carrosProprietarios.put(mercedes, joao);
		carrosProprietarios.put(audi, ana);
		carrosProprietarios.put(peugeot, maria);

		// Imprime:
		System.out.println("Carros e seus proprietários:");
		System.out.println(carrosProprietarios);

		// Consultas:
		System.out.println("Proprietário do carro BMW: " + carrosProprietarios.get(bmw));
		System.out.println("Proprietário do carro BMW: " + carrosProprietarios.get(new Carro("ALG1A23", "xxx")));
		System.out
				.println("Proprietário do carro Inválido: " + carrosProprietarios.get(new Carro("xxx1A23", "BMW X4")));

		// Iterar pelas chaves:
		System.out.println("Iterando sobre as chaves:");
		//		Set<Carro> chaves = carrosProprietarios.keySet(); // Uma alternativa.
		//		for (Carro carro : chaves) {
		//			System.out.println(carro);
		//		}
		for (Carro carro : carrosProprietarios.keySet()) {
			System.out.println(carro);
		}

		// Iterar pelos valores:
		System.out.println("Iterando sobre os valores:");
		for (Proprietario proprietario : carrosProprietarios.values()) {
			System.out.println(proprietario);
		}

		// Iterar pelas entradas (chave-valor):
		System.out.println("Iterando sobre as entradas (chave-valor):");
		//		for (Carro carro : carrosProprietarios.keySet()) {  // Uma alternativa.
		//			Proprietario proprietario = carrosProprietarios.get(carro);
		//			System.out.printf("Carro: %s (%s) = Proprietário %s%n",
		//					carro.getPlaca(), carro.getModelo(), proprietario.getNome());
		//		}

		for (Map.Entry<Carro, Proprietario> entry : carrosProprietarios.entrySet()) {
			System.out.printf("Carro: %s (%s) = Proprietário %s%n", entry.getKey().getPlaca(),
					entry.getKey().getModelo(), entry.getValue().getNome());
		}
		/* A declaração Map.Entry<Carro, Proprietario> entry
		 * pode ser subistituida por
		 * var entry */

		// Substituir o proprietário de um carro:
		System.out.println("Substituindo o proprietário do carro Peugeot:");
		carrosProprietarios.put(peugeot, jose);
		for (Map.Entry<Carro, Proprietario> entry : carrosProprietarios.entrySet()) {
			System.out.printf("Carro: %s (%s) = Proprietário %s%n", entry.getKey().getPlaca(),
					entry.getKey().getModelo(), entry.getValue().getNome());
		}

		// Remover um carro do mapa:
		System.out.println("Removendo o carro Audi:");
		// carrosProprietarios.remove(audi); // Uma alternativa.
		carrosProprietarios.remove(new Carro("JAV4A56", "xxx")); // Também funciona, pois a chave é baseada na placa.
		for (Map.Entry<Carro, Proprietario> entry : carrosProprietarios.entrySet()) {
			System.out.printf("Carro: %s (%s) = Proprietário %s%n", entry.getKey().getPlaca(),
					entry.getKey().getModelo(), entry.getValue().getNome());
		}

		// Por uma chave nula no Map:
		//System.out.println("Adicionando um chave(carro) nulo no mapa:");
		//carrosProprietarios.put(null, maria);
		//for (Map.Entry<Carro, Proprietario> entry : carrosProprietarios.entrySet()) {
		//	System.out.printf("Carro: %s (%s) = Proprietário %s%n",
		//			entry.getKey() != null ? entry.getKey().getPlaca() : "Nulo",
		//			entry.getKey() != null ? entry.getKey().getModelo() : "Nulo", entry.getValue().getNome());
		//}

		// Por um valor nulo no Map:
		System.out.println("Adicionando um valor(proprietário) nulo no mapa:");
		carrosProprietarios.put(bmw, null);
		carrosProprietarios.put(peugeot, null);
		for (Map.Entry<Carro, Proprietario> entry : carrosProprietarios.entrySet()) {
			System.out.printf("Carro: %s (%s) = Proprietário %s%n",
					entry.getKey() != null ? entry.getKey().getPlaca() : "Nulo",
					entry.getKey() != null ? entry.getKey().getModelo() : "Nulo",
					entry.getValue() != null ? entry.getValue().getNome() : "Nulo");
		}

	}

}
