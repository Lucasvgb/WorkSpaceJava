import java.util.Scanner;
/*
3) Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado
*/
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] vetor_A = new int[n];
        int [] vetor_B = new int[n];
        
        for(int i = 0; i < n; i++){
            vetor_A [i] = input.nextInt();
        }

        for(int i = 0; i < n; i++){
            vetor_B [i] = input.nextInt();
        }
    
        int [] vetor_C = new int[n];
        for(int i = 0; i < n; i++){
            vetor_C[i] = vetor_A[i] + vetor_B[i]; 
        }

        for(int i = 0; i < n; i++){
            System.out.print(vetor_C[i] + " ");
        }

        input.close();
    }
}
