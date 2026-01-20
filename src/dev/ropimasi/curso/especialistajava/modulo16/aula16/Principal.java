package dev.ropimasi.curso.especialistajava.modulo16.aula16;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;




public class Principal {

	public static void main(String[] args) {

		Path arquivo = Path.of("/home/habibi/Desktop/teste1.txt");
		BufferedReader reader = null; 
		
		try {
			reader = Files.newBufferedReader(arquivo);
			System.out.println(reader.readLine());
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				System.out.println("LOG: Erro ao fechar o reader: " + e.getMessage());
			}
			
			// Não pode lançar exceção nem dar return aqui dentro do finally.
		}

	}
}
