package week5;

public class Minavar_FindTheUnique {

    /*
    String - Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {

        Unique("AAABBBCCCDEF");

    }

    public static void Unique(String str){
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if(count == 1) {
                newStr += str.charAt(i);
            }
        }

        System.out.println(newStr);
    }
}
