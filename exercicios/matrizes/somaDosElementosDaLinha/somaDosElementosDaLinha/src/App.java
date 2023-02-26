import java.util.Scanner;
/*
Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois, mostrar na tela a soma dos
elementos de cada linha da matriz.
Entrada:
A entrada contém o número N, depois os dados da matriz.
Saída:
A saída contém os números representando a soma dos elementos de cada linha da matriz
*/
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int [][] mat = new int [N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                mat [i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            int soma = 0;
            for(int j = 0; j < N; j++){
                soma = soma + mat[i][j]; 
            }
            System.out.println(soma);
        }

        input.close();
    }
}
