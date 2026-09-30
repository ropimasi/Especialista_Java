package dev.ropimasi.curso.especialistajava.modulo20.aula11;

public class Anonimizacao {

	public static void main(String[] args) {

		String html = "<a \n href=\"mailto:joao@gmail.com\">\n  joao@gmail.com</a>"
				+ "<a>abc@algaworks.com</a><a>xyz@algaworks.com   </a>" + "<strong>   maria@algaworks.com \n </strong>";

		System.out.println("\n" + html + "\n");

		//		String regex = "<.\\s*.*?>\\s*(?<email>[\\w.-]+@[a-z0-9.-]+\\.[a-z]{2,3})\\s*</.*?>";
		String regex = "[\\w.-]+@[a-z0-9.-]+\\.[a-z]{2,3}";

		//		String novoHtml = html.replaceFirst(regex, "email@anonimizado");
		String novoHtml = html.replaceAll(regex, "email@anonimizado");

		System.out.println("\n" + novoHtml + "\n");

	}

}
