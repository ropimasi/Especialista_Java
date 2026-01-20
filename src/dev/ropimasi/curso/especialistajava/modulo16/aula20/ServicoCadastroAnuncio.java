package dev.ropimasi.curso.especialistajava.modulo16.aula20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;




public class ServicoCadastroAnuncio {

	public void cadastrar(String codigo, String descricao) {
		Path arquivo = Path.of("/home/habibi/Desktop/abc", codigo + ".txt");
		try {
			Files.writeString(arquivo, descricao);
		} catch (IOException e) {
			throw new CadastroAnuncioException("Erro ao cadastrar anúncio", e);
			
			// É melhor usar uma biblioteca de logging para isto:
			//System.out.println("Erro na gravação do arquivo: " + e.getMessage());
			//e.printStackTrace();
		}
	}

}
