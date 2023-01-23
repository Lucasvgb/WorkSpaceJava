import java.util.Scanner;
import java.util.Locale;
/*
 Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int A, B, soma;
        
        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
