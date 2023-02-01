import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y >0){
                System.out.println("Primeiro Quadrante");
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo Quadrante");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro Quadrante");
            }
            else if(x > 0 && y < 0){
                System.out.println("Quarto Quadrante");
            }
            x = input.nextInt();
            y = input.nextInt();
        }
        
        input.close();
        }
    }
