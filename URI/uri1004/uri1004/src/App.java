import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int prod = A * B;

        System.out.println("PROD = "+ prod);
        sc.close();
        
    }
}
