/*
 A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159

 A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

 SAIDA 
 Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double R,A,pi = 3.14159;

        R = sc.nextDouble();
        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}
