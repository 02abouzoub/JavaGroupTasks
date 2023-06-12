import java.util.Arrays;

public class SameLetter_salem {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";

        System.out.println(same("abc", "cab"));
    }

    public static boolean same(String str1, String str2) {


        String[] a1 = str1.split("");
        String[] a2 = str2.split("");

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean same = Arrays.equals(a1, a2);
        return same;
    }

}
