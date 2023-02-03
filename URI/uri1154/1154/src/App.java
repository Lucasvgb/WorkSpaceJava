import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int idade = input.nextInt();
        int soma = 0;
        int cont = 0;

        while(idade > 0){
            soma = soma + idade;
            cont = cont + 1;
             idade = input.nextInt();
        }
        double media = (double)soma / cont;
        System.out.printf("%.2f%n",media);

        input.close();
    }
}
