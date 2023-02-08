import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner sc = new Scanner(System.in);

        int fatorial = 1;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);


        sc.close();
    }
}
