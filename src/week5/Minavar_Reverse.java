package week5;

public class Minavar_Reverse {
    /*
     String -- Reverse
     Write a function that can reverse a String
     Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        Reverse("ABCD");
    }

    public static void Reverse(String str){
        String newStr ="";

        for (int i = str.length()-1; i >=0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}
