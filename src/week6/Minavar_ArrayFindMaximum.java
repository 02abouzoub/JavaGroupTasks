package week6;

import java.util.Arrays;

public class Minavar_ArrayFindMaximum {

    /*
    Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println(FindMaximum(arr));
    }

    public static int FindMaximum(int[] arr){
        //First way:
       //  Arrays.sort(arr);
       // return arr[ arr.length - 1 ];


        //Second way:
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max ) {
                max = arr[i];
            }
        }

        return max;

    }
}
