package week2;

public class minavar_swapNumbers {
    /*
    Swap two variable's values without using a third variable
     */
    public static void main(String[] args) {

        int x = 4; // -> 8
        int y = 8; // -> 4

        x = x+y; // -> 8+4=12 -> x=12
        y = x-y; // -> 12-8=4 -> y=4
        x= x-y; // -> 12-4=8 -> x=8

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
