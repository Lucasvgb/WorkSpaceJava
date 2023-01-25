import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double delta = Math.pow(B, 2.0) - 4.0 * A * C;

        if(A == 0 || delta < 0.0){
            System.out.println("Impossivel calcular");
        }
        else{
            double x1 = (-B  + Math.sqrt(delta)) / (2.0 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2.0 * A);
            
            System.out.printf("R1 = %.5f%n" , x1);
            System.out.printf("R2 = %.5f%n" , x2);
        }
        


        input.close();
    }
}
