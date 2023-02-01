import java.util.Scanner;
/*
 Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        while(num1 != num2){
            if(num1 > num2){
                System.out.println("Decrescente");
            }
            else{
                System.out.println("Crescente");
            }
            num1 = input.nextInt();
            num2 = input.nextInt();
        }
        
        



        input.close();
    }
}
