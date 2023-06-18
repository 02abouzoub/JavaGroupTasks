package week03;

public class frequencyOfCharacter {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println(frequencyOfChars("FFEEKLL"));
        System.out.println(frequencyOfChars("UUIOOYTTG"));

    }
    public static String frequencyOfChars(String str) {

        String fequency = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if (fequency.contains(str.charAt(i) + "")) {
                continue;
            }
            fequency += str.charAt(i) + "" + count+" ";

        }

       return fequency;

    }
}


/*
String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */