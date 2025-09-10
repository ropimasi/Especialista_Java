public class AreasPrincipal {
    public static void main(String[] args) {
        double lado = 2;
        double raio = 2;

        System.out.printf("Quadrado: %.4f.%n", AreasCalculadora.doQuadrado(lado));
        System.out.printf("Círculo: %.4f.%n", AreasCalculadora.doCirculo(raio));
    }
}
