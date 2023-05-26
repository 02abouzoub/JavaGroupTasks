package Week1;

public class Ahmed_OddOrEvenTask {
    public static void identify(double number) {

        if (number == 0) {
            System.out.println("Zero");
        } else if (number % 2 == 0) {
            System.out.println(number + " is an Even number");
        } else if (number % 2 != 0) {
            System.out.println(number + " is an Odd number");
        }
    }

    public static void main(String[] args) {

        identify(-2);
    }
}
/*
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */


