package week04;

import java.util.Arrays;

public class sameLetters {
    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("xhc", "cab"));
        System.out.println(sameLetters("aba", "aab"));


    }
    public static boolean sameLetters(String a, String b){

       char[] arr1= a.toCharArray();
       char[] arr2= b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


    return Arrays.toString(arr1).equals(Arrays.toString(arr2));

    }

}
/*
➡️ String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
