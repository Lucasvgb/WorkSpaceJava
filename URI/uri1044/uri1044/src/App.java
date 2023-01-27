import java.util.Scanner;
/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if(a % b == 0 || b % a ==0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

        input.close();
    }
}
