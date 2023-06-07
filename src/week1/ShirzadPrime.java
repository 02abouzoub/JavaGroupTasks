package week1;

public class ShirzadPrime {

    public static void main(String[] args) {

        System.out.println(isPrime(24));

        System.out.println(isPrime(13));

        System.out.println(isPrime(30));

        System.out.println(isPrime(97));


    }

    public static boolean isPrime(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
