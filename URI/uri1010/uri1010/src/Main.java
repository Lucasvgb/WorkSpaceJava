import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca01 = sc.nextInt();
        int numeroPeca01 = sc.nextInt();
        double valorUnitario01 = sc.nextDouble();

        int codigoPeca02 = sc.nextInt();
        int numeroPeca02 = sc.nextInt();
        double valorUnitario02 = sc.nextDouble();
    
        double soma = (numeroPeca01 * valorUnitario01) + (numeroPeca02 * valorUnitario02);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n" ,soma);


        sc.close();
    }
}
