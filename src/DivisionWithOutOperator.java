public class DivisionWithOutOperator {

    public static void division(int num1, int num2) {
        int count = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;
        }

        System.out.println(count + " with a remainder of " + num1);


    }
}
