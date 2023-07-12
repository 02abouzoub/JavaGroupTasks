package week8;

import java.util.Arrays;


public class Array_Move_Zeros_to_the_End {

    /*
    Question 3: Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

        System.out.println(Arrays.toString(AllZeroLast(arr)));
    }


    public static int[] AllZeroLast(int[] arr) {

     int[] newArr = new int[arr.length];
     int index = 0;

     for (int each : arr){
         if(each != 0){
           newArr[index] = each;
           index++;
         }
     }
     return newArr;
    }
}

