
public class App {
    public static void main(String[] args) throws Exception {
        
        int v [] = new int[2];
        int w [] = new int [0];

        int d;
        for(d = 1; d < 4; d++){
            v[d] = v [d - 1] * 2;
        }
        for(d = 0; d < 4; d++){
            w[d] = v [d] * 10;
            
        }
        System.out.println(v[d]);
        System.out.println(w[d]);
    }
}
