package week1;

public class minavar_divisionWithoutOperator {
    /*
    2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
     */

     public static void divide(int num1, int num2){
        int count =0;

        while(num1 >= num2){
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and reminder is: " + num1);
    }

    public static void main(String[] args) {

        divide(20,3);

    }
}
