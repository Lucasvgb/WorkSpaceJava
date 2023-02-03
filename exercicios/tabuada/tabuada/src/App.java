public class App {
    public static void main(String[] args) throws Exception {
        
        int mult = 0;
        int numero = 140;
        int soma = 0;
        for(int n = 1; n <= 10; ++n ){
            soma = soma + n;
            mult = soma * numero;
            System.out.printf("%d"soma ," x", numero," = ", mult);
        }
        
    }
}
