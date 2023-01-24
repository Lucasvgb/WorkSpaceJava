import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome01 = sc.next();
        int idade01 = sc.nextInt();

        String nome02 = sc.next();
        int idade02 = sc.nextInt();

        double media = (double) (idade01 + idade02) / 2;

        System.out.printf("A idade de %s e %s é de %.1f anos", nome01, nome02 , media);

        sc.close();
    }
}
