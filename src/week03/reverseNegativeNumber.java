package week03;

import java.sql.Array;
import java.util.Arrays;

public class reverseNegativeNumber {
    public static void main(String[] args) {


        System.out.println(reverseNegative(-35));
        System.out.println(reverseNegative(35));
        System.out.println(reverseNegative(-67));
        System.out.println(reverseNegative(-10));
    }
    public static String reverseNegative(int num) {
        int num1 = 0;
        int num2 = 0;
        if (num < 0) {
            num1 = num % 10;
            num2 = num / -10;

            return num1 +""+ num2;
        }
        return num + "";
    }
}
/*
  2) Number - Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
 Input: -35  output: -53
 */