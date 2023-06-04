public class Swap_salem {
    public static void main(String[] args) {


        int a = 2;
        int b = 4;

        int z = a; // temporary
         a = b;
         b = z;

        System.out.println("b = " + b);
        System.out.println("a = " + a);


        System.out.println(".............................................................");

        int x = 10;
        int y = 15;

        x = x + y; // 25
        y = x - y; // 10
        x = x - y; // 15

        System.out.println("y = " + y);
        System.out.println("x = " + x);


    }
}