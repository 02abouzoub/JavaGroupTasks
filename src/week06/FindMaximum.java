package week06;

import java.sql.Array;
import java.util.Arrays;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

       Arrays.sort(arr);
     //  System.out.println(Arrays.toString(arr));
       int max= arr[arr.length-1];

        System.out.println(max);
        System.out.println("-------------------------------------");

        int max1= arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        System.out.println(max1);
    }
}
/*
3️⃣ Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
