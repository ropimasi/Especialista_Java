import java.util.Scanner;

public class Desafio1For {

  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    int numeroPar;
    int somaTotal = 0;

    for (int i=1; i<=10; i++) {
      System.out.printf("Digite um número inteiro par (%d/10): ", i);
      numeroPar = scan.nextInt();
      
      if (numeroPar % 2 == 0) {
        somaTotal += numeroPar;
      } else {
        i--;
      }
    }

    System.out.printf("Soma total: %d%n", somaTotal);
  }
}
