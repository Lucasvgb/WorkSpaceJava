import java.util.Scanner;
import java.util.Locale;
/*
Faça um vetor que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor.
- Mostrar na tela a soma e a média dos elementos do vetor. 
 */
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();
        double [] vet = new double [n];

        for(int i = 0; i < n; i++){
            vet[i] = input.nextDouble();
        }

        double media = 0;
        double soma = 0.0;
        for(int i = 0; i < n; i++){
            System.out.print(vet[i] + " ");
            soma = soma + vet[i];
            media = soma / n;
        }
        System.out.println();
        System.out.printf("%.2f%n", soma);
        System.out.printf("%.2f%n", media);

        input.close();
    }
}
