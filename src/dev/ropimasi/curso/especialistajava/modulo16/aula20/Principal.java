package dev.ropimasi.curso.especialistajava.modulo16.aula20;

public class Principal {

	public static void main(String[] args) {
		
		ServicoCadastroAnuncio servico = new ServicoCadastroAnuncio();
		servico.cadastrar("321", "Téiuãshtchi");
		
		System.out.println("Anúncio cadastrado com sucesso!");
		
	}
}
