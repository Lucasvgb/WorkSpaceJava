import java.util.Scanner;
/*
6) Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome da pessoa mais velha.
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] idades = new int [n]; 
        String [] nomes = new String[n];

        for(int i = 0; i < n; i++){
            nomes[i] = input.next();
            idades[i] = input.nextInt();
        }

        int maiorIdade = idades[0];
        int maiorPossicao = 0;

        for(int i = 0; i < n; i++){
            if(idades[i] > maiorPossicao){
                maiorIdade = idades[i];
                maiorIdade = i;
            }
        }
        System.out.println("Pessoa mais velha:" + nomes[maiorPossicao]);

        input.close();
    }
}
