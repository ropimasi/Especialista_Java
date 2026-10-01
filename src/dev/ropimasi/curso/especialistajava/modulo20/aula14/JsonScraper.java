package dev.ropimasi.curso.especialistajava.modulo20.aula14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonScraper {

    public static void main(String[] args) {
        String json1 = "{\n" +
                "    \"id\": 1,\n" +
                "    \"nome\": \"João da Silva\"\n" +
                "},\n" +
                "{\n" +
                "    \"id\": 2,\n" +
                "    \"nome\":\"Maria Abadia\"\n" +
                "},\n" +
                "{\n" +
                "    \"id\": 3,\n" +
                "    \"nome\":\n" +
                "        \"Sebastião Carvalho\"\n" +
                "}";
        
        String json2 = """
				{
				  "id": 1,
				  "nome": "João da Silva"
				},
				{
				  "id": 2,
				  "nome": "Maria Abadia"
				},
				{
				  "id": 3,
				  "nome":
				      "Sebastião Carvalho"
				}""";

        System.out.println(json1);
        System.out.println();
        System.out.println(json2);
        System.out.println();
        
        String rege =  "<.\\s*.*?>\\s*(?<nome>[\\w.-]+@[a-z0-9.-]+\\.[a-z]{2,3})\\s*</.*?>";
        String regex1 =	"\"nome\":\\s*\"(?<nome>.*?)\"";
        String regex2 =	".*?\"nome\":\\s*\"(?<nome>.*?)\".*?";
        
		Pattern pattern = Pattern.compile(regex1);
		Matcher matcher = pattern.matcher(json2);
		
		while (matcher.find()) {
			System.out.println("-");
			System.out.println(matcher.group("nome"));
			
		}
		
        
    }

}
