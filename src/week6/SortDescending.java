package week6;

import java.util.Arrays;

public class SortDescending {
    public static int[] sortDescending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        return arr;

    }
}
