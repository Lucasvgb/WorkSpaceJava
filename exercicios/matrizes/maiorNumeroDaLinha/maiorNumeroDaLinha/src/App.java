import java.util.Scanner;
/*
Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha não haver
empates.
Entrada:
A entrada contém o número N, depois os dados da matriz.
Saída:
A saída contém os números representando o maior elemento de cada linha da matriz. 
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
            int maiorNumeroLinha = mat[i][0];
            for(int j = 1; j < N; j++){
                if(mat[i][j] > maiorNumeroLinha){
                    maiorNumeroLinha = mat[i][j];
                }  
            }
        }
        input.close();
    }
}
