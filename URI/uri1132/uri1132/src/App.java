import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int menor = num1;
        int maior = num2;

        if(num1 > num2){
            menor = num2;
			maior = num1;
        }

        int soma = 0;
        for(int i = menor; i <= maior; i++){
            if(i % 13 != 0){
                soma = soma + i;
            }
        }
        System.out.println(soma); 

        sc.close();
    }
}
