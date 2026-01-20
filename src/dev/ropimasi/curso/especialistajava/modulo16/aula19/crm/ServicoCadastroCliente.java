package dev.ropimasi.curso.especialistajava.modulo16.aula19.crm;

public class ServicoCadastroCliente {

	public Cliente cadastrar(String nome, int idade) {
		if (idade < 18) {
			//return null;
			throw new MenorDeIdadeException("Cliente menor de idade não pode ser cadastrado: " + idade + " anos.");

		}

		//TODO: cadastrar no banco de dados.

		return new Cliente(nome, idade);
	}

}
