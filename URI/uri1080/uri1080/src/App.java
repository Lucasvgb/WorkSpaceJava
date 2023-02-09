import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int posicao = 1;

        for(int i = 1; i <= n; i++){
            int y = input.nextInt();
            if(y > n){
                n = y;
                posicao = i;
            }
        }
        System.out.println(n);
		System.out.println(posicao);

        input.close();
    }
}
