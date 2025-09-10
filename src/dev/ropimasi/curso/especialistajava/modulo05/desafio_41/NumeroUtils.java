public class NumeroUtils {


    public static int maior(int a, int b) {
        return (a > b) ? a : b ; // Math.max().
    }

    public static int maior(int a, int b, int c) {
        return (a > b) && (a > c) ? a : (b > c) && (b > a) ? b : c ;
    }

    public static double maior(double a, double b) {
        return (a > b) ? a : b ; // Math.max().
    }

    public static double maior(double a, double b, double c) {
        return (a > b) && (a > c) ? a : (b > c) && (b > a) ? b : c ;
    }


}
