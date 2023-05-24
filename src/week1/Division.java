package week1;

public class Division {

    public static void division(double n1, double n2) {

        int count = 0;
        while (n1 >= n2) {
            n1 -= n2;
            count++;
        }
        System.out.println(count + " with the remainder of " + n1);

    }

    public static void main(String[] args) {
        division(11,5);
    }
}
