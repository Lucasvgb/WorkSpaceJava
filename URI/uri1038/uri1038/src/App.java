import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo = input.nextInt();
        int quantidade = input.nextInt();

        double total;

        if(codigo == 1){
            total = quantidade * 4.0;
        }
        else if(codigo == 2){
            total = quantidade * 4.50;
        }
        else if(codigo == 3){
            total = quantidade * 5.00;
        }
        else if(codigo == 4){
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n",total);

        input.close();
    }
}
