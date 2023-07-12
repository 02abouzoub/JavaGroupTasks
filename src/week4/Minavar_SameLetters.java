package week4;

import java.util.Arrays;

public class Minavar_SameLetters {
        /*
        Write a return method that check if a string is build out of the same letters as another string.
          Ex: same("abc", "cab"); -> true
              same("abc", "abb"); -> false:
         */

    public static void main(String[] args) {


        System.out.println(same("abc", "abb"));
        System.out.println( same("abc", "cab"));
    }

    public static boolean same(String a, String b) {

        char[] str = a.toCharArray();
        Arrays.sort(str);
        //System.out.println(str);

        char[] newStr = b.toCharArray();
        Arrays.sort(newStr);
        //System.out.println(newStr);

       return Arrays.equals(str,newStr);
    }

}

