package dev.ropimasi.curso.especialistajava.modulo24.aula01e02;

public class Principal {

	public static void main(String[] args) {
		ServicoEmail servico = new ServicoEmail();

		ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem("joao@algaworks.com", "maria@algaworks.com",
				"Olá, tudo bem?");

		servico.enviar(mensagem);
	}

}
