import java.util.Locale;
import java.util.Scanner;
/*
 * Fazer um programa que leia 3 números inteiros. Em seguida, mostrar qual o menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.printf("MENOR = " + num1);
        }
        else if(num2 < num3){
            System.out.println("MENOR = " + num2);
        }
        else{
            System.out.println("MENOR = " + num3);
        }
        

        input.close();
    }
}
