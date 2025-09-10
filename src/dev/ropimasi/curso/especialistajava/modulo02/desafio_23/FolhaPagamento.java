import java.util.Scanner;

public class FolhaPagamento {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Nome: ");
    String nome = entrada.nextLine();
    
    System.out.print("Valor por hora (decimal): ");
    double valorHora = entrada.nextDouble();
    entrada.nextLine();
    
    System.out.print("Horas trabalhadas (inteiro): ");
    int horasTrabalhadas = entrada.nextInt();
    entrada.nextLine();
    
    System.out.print("Valor dos descontos (decimal): ");
    double descontos = entrada.nextDouble();
    entrada.nextLine();
    
    double subtotal = horasTrabalhadas * valorHora;
    
    System.out.printf("Folha de pagamento: %s%n", nome);
    System.out.printf("%d horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorHora, subtotal);
    System.out.printf("Descontos: R$%.2f%n", descontos);
    System.out.printf("Total devido: R$%.2f%n", (subtotal - descontos));
    
       
  }

}
