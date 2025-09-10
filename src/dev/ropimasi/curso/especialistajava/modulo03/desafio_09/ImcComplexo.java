import java.util.Scanner;

public class ImcComplexo {

  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Defina o sexo. 0 para mulher ou 1 para homem: ");
    int sexo = entrada.nextInt();
    entrada.nextLine();
    
    if ((sexo == 0) || (sexo == 1)) { // entrada válida.
      System.out.print("Peso: ");
      double peso = entrada.nextDouble();
      entrada.nextLine();
      
      System.out.print("Altura: ");
      double altura = entrada.nextDouble();
      entrada.nextLine();
      
      double imc = peso / (altura * altura);
      
      if (((sexo == 0) && (imc < 19.1)) || ((sexo == 1) && (imc < 20.7))) {
        System.out.printf("Abaixo do peso. IMC: %.2f%n", imc);
      } else if (((sexo == 0) && (imc >= 19.1) && (imc < 25.8))
          || ((sexo == 1) && (imc >= 20.7) && (imc < 26.4))) {
        System.out.printf("Peso ideal. IMC: %.2f%n", imc);      
      } else if (((sexo == 0) && (imc >= 25.8) && (imc < 27.3))
          || ((sexo == 1) && (imc >= 26.4) && (imc < 27.8))) {
        System.out.printf("Um pouco acima do peso. IMC: %.2f%n", imc);
      } else if (((sexo == 0) && (imc >= 27.3) && (imc < 32.3))
          || ((sexo == 1) && (imc >= 27.8) && (imc < 31.1))) {
        System.out.printf("Acima do peso ideal. IMC: %.2f%n", imc);
      } else if (((sexo == 0) && (imc >= 32.3)) || ((sexo == 1) && (imc >= 31.1))) {
        System.out.printf("Obeso. IMC: %.2f%n", imc);
      }
    
    } else { // entrada inválida.
      System.out.println("Entrada inválida.");
    }
    
    System.out.println("Fim do programa.");
  }

}
