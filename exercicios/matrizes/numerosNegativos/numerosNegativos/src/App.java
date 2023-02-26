import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        int [][] mat = new int [m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ;j++){
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ;j++){
                if(mat[i][j] < 0){
                    System.out.println(mat[i][j]);
                }
            }
        }

        input.close();
    }
}
