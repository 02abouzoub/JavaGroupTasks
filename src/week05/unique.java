package week05;

public class unique {
    public static void main(String[] args) {
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));

    }
    public static String unique(String str){

        String uniqueChars= "";

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
           if(str.indexOf(ch)== str.lastIndexOf(ch)){
               uniqueChars += ch;
           }
        }


        return uniqueChars;


    }
}
/*String - Find the unique
        Write a return method that can find the unique characters from the String
        Ex: unique("AAABBBCCCDEF") ==> "DEF";


 */
