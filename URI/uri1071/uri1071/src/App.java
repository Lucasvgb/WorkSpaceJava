import java.util.Scanner;
/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int min,max;
        if(x < y){
            min = x;
            max = y;
        }
        else{
            min = y;
            max = x;
        }
         
        int soma = 0;
        for(int i = min + 1; i < max; i++){
            if(i % 2 != 0){
                soma = soma + i;
            }
        }
        System.out.println(soma);

        input.close();
    }
}
