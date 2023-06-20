package Week5;

public class reverseString {

    public static void main(String[] args) {

        /*
        String -- Reverse
        Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
         */

        String str = "ABCD";
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
           // System.out.println(ch);
            result+=ch;
        }

        System.out.println(result);
    }
}
