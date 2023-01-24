import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double area, base, altura, perimetro,diagonal;

        base = sc.nextDouble();
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2.0 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
        
        System.out.printf("AREA = %.4f%n ", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);


        sc.close();
    }
}
