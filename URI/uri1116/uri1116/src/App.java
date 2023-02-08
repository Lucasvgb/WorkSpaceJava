import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            if(num2 == 0){
                System.out.println("divisao impossivel");
            }
            else{
                double divisao = (double) num1 / num2;
                System.out.printf("%.1f%n" , divisao);
            }
        }

        input.close();
    }
}
