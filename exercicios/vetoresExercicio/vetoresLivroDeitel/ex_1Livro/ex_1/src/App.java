//Esse exercício foi tirado do livro do Deitel, eu coloquei aqui só para depurar e ver melhor sobre o mesmo.

public class App {
    public static void main(String[] args) throws Exception {
        
        final int ARRAY_LENGHT = 10;
        int [] array = new int[ARRAY_LENGHT];

        for(int i = 0; i < array.length; i++){
            array[i] = 2 + 2 * i;
        }

        System.out.printf("%s%8s%n", "Index", "Valor");
        for(int i = 0; i < array.length; i++){
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}