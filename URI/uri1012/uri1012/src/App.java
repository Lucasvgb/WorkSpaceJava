import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double areaDoTriangulo = A * C / 2.0;
        double areaDoCirculo = 3.14159 * Math.pow(C,2.0);
        double areaDoTrapezio = (A + B)  / 2.0 * C;
        double areaDoQuadrado = Math.pow(B, 2.0);
        double areaDoRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaDoTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaDoCirculo);
        System.out.printf("TRAPEZIO: %.3f%n",areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f%n",areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f%n",areaDoRetangulo);
        
        sc.close();
    }
}
