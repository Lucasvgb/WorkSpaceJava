import java.util.Locale;

/*
Esse programa exibe uma tabela de conversões de galões em litros.
*/

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        double polegadas,metros;
        int contador;

        System.out.printf("%-10s %-10s\n", "Polegadas", "Metros");
        contador = 0;
        for(polegadas = 1; polegadas <= 100; polegadas++){
            metros = polegadas / 39.37;
            System.out.println(polegadas + " Polegadas sao " + metros  + " metros");
            contador++;

        if(contador == 12){
            System.out.println();
            contador = 0; //Zera o contador.
                }
            }
        }
    }
