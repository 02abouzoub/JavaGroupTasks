package week2;

public class Yuliya_SwapNumbers {
    public static void main(String[] args) {

        int a = 30;
        int b = 15;

        a = a+b;
        b = a-b;
        a= a-b;

        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }
}
