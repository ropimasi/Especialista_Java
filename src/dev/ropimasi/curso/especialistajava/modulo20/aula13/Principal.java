package dev.ropimasi.curso.especialistajava.modulo20.aula13;

public class Principal {

	public static void main(String[] args) {

		String html = "<a \n href=\"mailto:joao@gmail.com\">\n  joao@gmail.com</a>"
				+ "<a>abc@algaworks.com</a><a>xyz@algaworks.com   </a>"
				+ "<strong>   maria@algaworks.com \n </strong>";

		System.out.println("\n" + html + "\n");

		String html2 = """
				<a
				href="mailto:joao@gmail.com">
					joao@gmail.com
				</a>
				<a>
					abc@algaworks.com</a><a>xyz@algaworks.com
				</a>
				%d
				%s
				<strong>
					maria@algaworks.com
				</strong>""".formatted(3, "teste");

		System.out.println(html2);
		
	}

}
