import java.util.Scanner;
import java.util.Locale;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
do vetor (supor não haver empates). Mostrar também a posição do maior elemento.
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();
        double [] vet = new double[n];
        
        for(int i = 0; i < n; i++){
            vet[i] = input.nextDouble();
        }

        double maior = vet[0];
        int posiMaior = 0;

        for(int i = 1; i < n; i++){
            if(vet[i] > maior){
                maior = vet[i];
                
                posiMaior = i;
            }
        }

        System.out.printf("%.1f%n", maior);
		System.out.println(posiMaior);

        input.close();
    }
}
