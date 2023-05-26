package Week1;

public class Ahmed_DivisionTask {

    public static void divide(double n1, double n2) {

        int count = 0;

        if (n2 <= 0) {
            System.err.println("Invalid entry");
        }

        while (n1 >= n2) {
            n1 -= n2;
            count++;
            }



        System.out.println(count +" with a remainder of "+n1);
    }



    public static void main(String[] args) {

        divide(10,2);
        divide(30,6);
        divide(100,9);
        divide(10,0);
    }


}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */