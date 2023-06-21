package week3;

public class FrequencyOfCharacters {

    public static String FreqOfChars(String str) {
        String frequency = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(frequency.contains(str.charAt(i)+"")){
                continue;

            }
            frequency+=str.charAt(i)+""+count;

        }
        return frequency;
    }

    public static void main(String[] args) {
        System.out.println(FreqOfChars("AAABBCDD**"));
    }

}


/*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */