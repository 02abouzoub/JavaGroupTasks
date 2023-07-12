package week7;

public class Minavar_ArrayFindMinimum {
    /*
    Write a method that can find the minimum number from an int Array
     */

    public static void main(String[] args) {

        int[] arr = {5, 24, 89, 3, 40, 0, -25};

        System.out.println(FindMin(arr));
    }

    public static int FindMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}