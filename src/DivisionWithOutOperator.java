public class DivisionWithOutOperator {

    public static void division(int num1, int num2) {


        int count = 0;
        if(num2 <= 0){
            System.err.println("Invalid entry");
        }

        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;
        }

        System.out.println(count + " with a remainder of " + num1);


    }

    public static void main(String[] args) {
        division(10, 0);
    }
}
