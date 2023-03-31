public class App {
    public static void main(String[] args) throws Exception {
        // Crie três conjuntos de palavras onde será feita a seleção. Adicione o que quiser!
        String [] listaDePalavrasUm = {"eu","tu","Lucas","voce","nos","dois"};
        String [] listaDePalavrasDois = {"aqui","acoes","dinheiro","quimica","caraca","testando"};
        String [] listaDePalavrasTres = {"vicê","errado","aqui","nao","sim","maluco","ferro"};

        //Descubra quantas palavras tem em cada lista.
        int listaUmLenght = listaDePalavrasUm.length;
        int listaDoisLenght = listaDePalavrasDois.length;
        int listaTresLenght = listaDePalavrasTres.length;

        //Gere três números aleatórios.
        int rand1 = (int) (Math.random() * listaUmLenght);
        int rand2 = (int) (Math.random() * listaDoisLenght);
        int rand3 = (int) (Math.random() * listaTresLenght);

        //Agora construa uma frase.
        String frase = listaDePalavrasUm[rand1] + " " + listaDePalavrasDois[rand2] + " " + listaDePalavrasTres[rand3];

        //Exibir a frase.
        System.out.println("Precisamos de " + frase);

    }
}
