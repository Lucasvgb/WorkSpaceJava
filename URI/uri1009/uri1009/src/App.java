import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nomeVendedor = sc.next();
        double salarioFixo = sc.nextDouble();
        double totalDeVendas = sc.nextDouble();

        double total = totalDeVendas * 0.15 + salarioFixo;
        
        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }
}
