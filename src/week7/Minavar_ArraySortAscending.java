package week7;

import java.util.Arrays;


public class Minavar_ArraySortAscending {
    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, -3};
        System.out.println(Arrays.toString(sortArrayAsc(arr)));
    }

    public static int[] sortArrayAsc(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];

                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        return arr;
    }
}

