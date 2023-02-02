import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double nota1 = input.nextInt();
        while(nota1 < 0.0 || nota1 > 10.0){
            System.out.println("nota invalida");
            nota1 = input.nextInt();
        }

        double nota2 = input.nextInt();
        while(nota2 < 0.0 || nota2 > 10){
            System.out.println("nota invalida");
            nota2 = input.nextInt();
        }

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("media = %.2f%n", media);

        input.close();
    }
}
