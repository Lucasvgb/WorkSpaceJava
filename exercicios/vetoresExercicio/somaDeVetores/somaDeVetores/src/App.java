import java.util.Locale;
import java.util.Scanner;
/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
*/
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int [] vetorA = new int[n];
        int [] vetorB = new int[n];

        for(int i = 0; i < n; i++){
            vetorA[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++){
            vetorB[i] = input.nextInt();
        }

        int [] vetorC = new int[n];
        for(int i = 0; i < n; i++){
           vetorC[i] = vetorA[i] + vetorB[i];
        }

        for(int i = 0; i < n; i++){
            System.out.print(vetorC[i] + " ");
        }
       
        input.close();
    }
}
