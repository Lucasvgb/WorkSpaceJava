import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);

        int senha = input.nextInt();

        while(senha != 2002){
            System.out.println("Senha Invalida");
            senha = input.nextInt();
        }
        if(senha == 2002){
            System.out.println("Acesso permitido");
        }
        else{
            System.out.println("Digite um numero valido");
        }

        input.close();
    }
}
