package week6;

public class Minavar_StringSumOfAllDigits {

    /*
     String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
     */

    public static void main(String[] args) {

        System.out.println(SumOfAllDigits("12 java 5 apple 3"));
    }

    public static int SumOfAllDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }
        return sum;

    }

}