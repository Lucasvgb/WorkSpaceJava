import java.util.Scanner;
import java.util.Locale;

/*
7) Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
considerando aprovados aqueles cuja média das notas seja maior ou igual a seis. 
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();

        String [] nomes = new String[n];
        double [] notasPrimeiroSemestre  = new double[n];
        double [] notasSegundoSemestre  = new double[n];

        for(int i = 0; i < n; i++){
            nomes[i] = input.next();
            notasPrimeiroSemestre [i] = input.nextDouble();
            notasSegundoSemestre [i] = input.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        double media = 0;
        for(int i = 0; i < n; i++){
           media =  (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2.0;
           if(media >= 6.0){
            System.out.println(nomes[i]);
           }
        }
        
        input.close();
    }
}
