package week03;

public class primeNumber {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        }
    public static void main(String args[]) {
        System.out.println((isPrime(13)));

        System.out.println((isPrime(2)));

    }
}
/*
   1) Numbers - Prime Number
Write a method that can check if a number is prime or not
 */
