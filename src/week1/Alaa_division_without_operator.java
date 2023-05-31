package week1;
import java.util.Scanner;

public class Alaa_division_without_operator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        int operator = 0;
        while (a >= b) {
            a = a - b;
            operator = operator + 1;
            System.out.println("Division is :" + operator);
        }
    }
}

