public class FrequencyOfCharacter_salem {

    public static void main(String[] args) {
        String str = "AAABBBBCCDDD";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch == ch2) {
                    count++;
                }


            }
            if (result.contains(ch + "")) {
                continue;
            }
              result+= ch;
              result+=count;

        }


        System.out.println(result);

    }
}
/*
 3) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2** (edited)
Jump

 */