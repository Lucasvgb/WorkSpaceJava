import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] vet = new int [n];

        for(int i = 0; i < n; i++){
            vet [i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }
        input.close();
    }
}
