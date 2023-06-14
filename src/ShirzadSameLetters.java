import java.util.Arrays;

public class ShirzadSameLetters {

    public static void main(String[] args) {

        System.out.println(result("abc", "cba"));


    }

    public static boolean result(String a, String b){

        char[] array1 = a.toCharArray();

        Arrays.sort(array1);

        char[] array2 = b.toCharArray();

        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }
}
