package week3;

public class ReverseNegativeNumber {
    /*
       2) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
 Input: -35  output: -53
 */

    public static void main(String[] args) {

        Reverse(-35);
    }

    public static void Reverse(int num){
        int reverseNum = 0;

        while(num !=0){

            int rem = num %10;
            num = num/10;
            reverseNum = reverseNum *10 +rem;

        }

        System.out.println(reverseNum);
    }
}