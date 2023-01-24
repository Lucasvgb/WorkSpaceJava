import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numeroDoFuncionario,horasTrabalhadas;
        double valorPorHora,salario;

        numeroDoFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorPorHora = sc.nextDouble();

        salario =  horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f%n",salario);

        sc.close();
    }
}
