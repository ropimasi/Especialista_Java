import java.util.Scanner;

public class Desafio2For {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean ePrimo = true;
    
    System.out.print("Digite um número inteiro positivo maior que zero: ");
    int numero = scan.nextInt();
    
    if (numero != 1 && numero != 2) {
      for (int i = 2; i < numero; i++ ) {
        if (numero % i == 0) {
          ePrimo = false;
          break;
        }
      }
    }
    
    System.out.printf("O número %d %s primo.%n", numero, (ePrimo ? "é" : "não é"));
    
  }
}
