import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [][] mat = new int [n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ;j++){
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println("DIAGONAL PRINCIPAL:");
        for(int i = 0; i < n ; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int cont = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] < 0)
                    cont = cont + 1;
            }   
        }
        System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

        input.close();
    }
}
