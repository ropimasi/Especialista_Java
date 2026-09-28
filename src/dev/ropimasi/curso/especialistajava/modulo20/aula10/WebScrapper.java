package dev.ropimasi.curso.especialistajava.modulo20.aula10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScrapper {

	public static void main(String[] args) {
		
		String html = "<a \n href=\"mailto:joao@gmail.com\">\n  joao@gmail.com</a>"
				+ "<a>abc@algaworks.com</a><a>xyz@algaworks.com   </a>"
				+ "<strong>   maria@algaworks.com \n </strong>";
		
		System.out.println("\n" + html + "\n");
		
//		String regex = "<strong>(.*)</strong>";
		String regex = "<.\\s*.*?>\\s*(?<email>[\\w.-]+@[a-z0-9.-]+\\.[a-z]{2,3})\\s*</.*?>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(html);
		
		while (matcher.find()) {
//			System.out.println(matcher.group(1));
			System.out.println(matcher.group("email"));
			
		}
		
		

	}

}
