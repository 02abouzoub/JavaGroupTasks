package week1;

public class IsraaDivisionWithoutOperator {
    public static void main(String[] args) {

        divideWithoutOperator(-22, 3);
        divideWithoutOperator(5, 2);
        divideWithoutOperator(10, 8);
        divideWithoutOperator(-12, 4);

    }

    public static void divideWithoutOperator(int numerator, int denominator) {

        int count = 0;

        if (denominator <= 0 || numerator <= 0) {
            System.err.println("Invalid number");
            System.exit(1);
        }

        while (numerator >= denominator) {

            numerator -= denominator;
            count++;
        }

        System.out.println(count + " with a reminder of " + numerator);

    }
}

