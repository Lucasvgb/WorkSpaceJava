public class App {
    public static void main(String[] args) throws Exception {
        
        int [] vetor = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // adiciona o valor de cada elemento ao total
        for(int contador = 0; contador < vetor.length; contador++){
            total = total + vetor[contador]; // OU total += vetor[contador]
        }

        System.out.printf("Soma dos elementos do Vetor: %d%n", total);
    }
}
