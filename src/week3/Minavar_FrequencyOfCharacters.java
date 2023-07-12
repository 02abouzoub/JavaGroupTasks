package week3;

public class Minavar_FrequencyOfCharacters {
    /*
    3) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
     */

    public static void main(String[] args) {


        FrequencyOfChars("AAABBCDD");

    }

    public static void FrequencyOfChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char each1 = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each2 = str.charAt(j);

                if (each1 == each2) {
                    count++;
                }
            }
            if (result.contains("" + each1)) {
                continue;
            }
            result += each1;
            result += count;
        }
        System.out.println(result);
    }
}