import java.util.Scanner;
/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
- todos os números pares
- a quantidade de números pares
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
         int n = input.nextInt();        int [] vet = new int [n];

        for(int i = 0; i < n; i++){            vet[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(vet[i] % 2 == 0){
                System.out.println(vet[i] + " ");
            }
        }
        System.out.println();

        int cont = 0;
        for(int i = 0; i < n; i++){
            if(vet[i] % 2 == 0){
                cont++;
            }
        }
        System.out.println(cont);

        input.close();
    }
}
