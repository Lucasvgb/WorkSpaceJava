import java.util.Scanner;
import java.util.Locale;
/*
Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
-  a maior e a menor altura do grupo
-  a média de altura das mulheres
-  o número de homens
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int n = input.nextInt();

        double [] alturas = new double[n];
        String [] sexo = new String[n];

        // Ler Vetores
        for(int i = 0;i < n; i++){
            alturas[i] = input.nextInt();
            sexo[i] = input.next();
        }

        // Maior Altura
        double maiorAltura = alturas[0];
        for(int i = 0; i < n;i++){
            if(alturas[i] > maiorAltura){
                alturas[i] = maiorAltura;
            }
        }
        //Menor Altura
        double menorAltura = alturas[0];
        for(int i = 0; i < n; i++){
            if(alturas[i] < menorAltura){
                alturas[i] = menorAltura;
            }
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        // Media de Altura das Mulheres
        int contMulheres = 0;
        double SomaMulheres = 0.0;
        for(int i = 0; i < n ; i++){
            if(sexo[i] == "F"){
                SomaMulheres = SomaMulheres + alturas[i];
                contMulheres++;
            }
        }

        if(contMulheres == 0){
            System.out.println("Nao tem muier");
        }
        else{
            double media = SomaMulheres / contMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        }

        int contHomens = 0;
		for (int i = 0; i < n ; i++) {
			if (sexo[i] == "M") {
				contHomens++;
			}
		}
		System.out.println("Numero de homens = " + contHomens);
		
        input.close();
    }
        
}
