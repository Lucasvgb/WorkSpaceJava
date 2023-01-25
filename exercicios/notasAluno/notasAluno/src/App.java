import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double primeiraNota = sc.nextDouble();
        double segundaNota = sc.nextDouble();

        double notaFinal = primeiraNota + segundaNota;
        System.out.printf("NOTA FINAL = %.1f%n" , notaFinal);

        if(notaFinal < 60.0){
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
