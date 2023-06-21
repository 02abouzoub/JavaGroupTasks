package week3;

public class ReverseNegativeNumber {

    public static int ReverseNegNum(int num) {
        int reversed = 0;
        while (num < 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;

        }
        return reversed;

    }

    public static void main(String[] args) {
        System.out.println(ReverseNegNum(-54));
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
 Input: -35  output: -53
 */