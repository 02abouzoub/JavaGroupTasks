package week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Minavar_RemoveDuplicates {

        /*
        Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC (edited)
 */

    public static void main(String[] args) {

        removeDup("AAABBBCCC");

        }

        public static void removeDup(String str){

            String newStr = "";

            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                boolean repated = false;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        repated = true;
                        break;
                    }
                }

                if (!repated) {
                    newStr += arr[i];
                }
            }

            System.out.println(newStr);

        }

    }

