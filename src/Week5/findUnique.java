package Week5;

public class findUnique {



    public static String Unique(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            // System.out.println(ch);
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch == ch2){
                    count++;
                }
            }

            if (count == 1){
                result += ch;
            }
        }

        System.out.println(result);

        return result;

    }


    public static void main(String[] args) {

        /*
        String - Find the unique
         Write a return method that can find the unique characters from the String
         Ex: unique("AAABBBCCCDEF") ==> "DEF";
         */


        Unique("AAABBBCCCDEF");

    }

}
