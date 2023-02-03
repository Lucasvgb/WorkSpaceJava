public class App {
    public static void main(String[] args) throws Exception {

        int total = 0;
        for(int numero = 2; numero <= 20 ; numero += 2){
            total += numero;
        }
        System.out.printf("A soma e %d%n", total);
    }
}
