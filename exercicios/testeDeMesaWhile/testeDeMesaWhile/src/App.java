public class App {
    public static void main(String[] args) throws Exception {
        
        int x = 0;
        int y = 0;

        while(x < 3){
            y = y + 2;
            x = x + 1;
            System.out.println(x + "-" + y);
        }

        System.out.println("---------------");

        int z = 5;
        int b = 0;

        while(z > 2){
                System.out.println(z);
                b = b + z;
                z = z - 1;
        }
       System.out.println("---------------");

       double u = 100;
       double o = 100;
       
       while( u != o){
            System.out.println("olha");
            u = Math.sqrt(o);
       }
    }
}
