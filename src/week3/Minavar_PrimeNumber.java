package week3;

public class Minavar_PrimeNumber {
    /*
     1) Numbers - Prime Number
Write a method that can check if a number is prime or not
     */

    public static void main(String[] args) {

     isPrime(15);

    }

    public static void isPrime(int num){

        int count =0;

        if(num <=1){
            System.err.println(num +" is invalid number");
            System.exit(1);
        }

        for(int i =1; i <= num; i++){

            if(num %i ==0){
                count++;
            }
        }

        if(count ==2){
            System.out.println(num+ " is prime");
        }else{
            System.out.println(num+ " isn't prime");
        }

    }
}