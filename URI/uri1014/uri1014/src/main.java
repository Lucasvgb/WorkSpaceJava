import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double combustivel,total;

        int distanciaTotal = sc.nextInt();
        combustivel = sc.nextDouble();

        total = distanciaTotal / combustivel;
        System.out.printf("%.3f km/l%n",total);

        sc.close();
    }
}
