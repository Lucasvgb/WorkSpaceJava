import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Locale.setDefault(Locale.US);

        double montante;
        double principal = 1000.0;
        double juros = 0.05;

        System.out.printf("%s%20s %n","Ano ", "Montante no deposito");
        
        for(int ano = 1; ano <= 10; ++ano){
            montante = principal * Math.pow(1.0 + juros, ano);
            System.out.printf("%4d%,20.2f%n", ano, montante);
        }
        */
        int soma = 1;
        for(int i = 0; i < 20; i++){
            soma = soma + i;
        }
        System.out.println(soma);

    }
}
