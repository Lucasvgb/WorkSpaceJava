import java.util.Scanner;
import java.util.Locale;

/*
Fazer um programa para ler um número N, depois nome(apenas uma palavra sem espaços), idade 
e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();

        String [] nomes = new String[n];
        int [] idades = new int[n];
        double [] alturas = new double[n];
        
        for(int i = 0; i < n; i++){
            nomes[i] = input.next();
            idades[i] = input.nextInt();
            alturas[i] = input.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < n ; i++){
            soma = soma + alturas[i];
        }
        
        double media = soma / n;
        System.out.printf("Altura Media: %.2f%n", media);

        int contadorPessoas = 0;
        for(int i = 0; i < n; i++){
            if(idades[i] < 16){
                contadorPessoas = contadorPessoas + 1;
            }
        }
        double x = contadorPessoas * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);

        input.close();
    }
}
