public class App {
    public static void main(String[] args) throws Exception {
        int numero = 5;
        for(int linha = 1 ; linha <= numero; linha++){
            for(int coluna = 1; coluna <= linha ; coluna++){
                System.out.print(linha * coluna + " ");
            }
            System.out.println();
        }
        
    }
}
