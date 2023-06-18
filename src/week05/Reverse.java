package week05;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("reverse((\"ABCD\")) = " + reverse(("ABCD")));

    }
    public static String reverse(String str){
        char [] ch= str.toCharArray();
        String reversed= "";
        for (int i = ch.length - 1; i >= 0; i--) {
            reversed += ch[i];

        }
        return reversed;
    }

}
/*➡️ String -- Reverse
 Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA

 */