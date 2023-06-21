package Week3;

public class Ahmed_Frequency {

    public static void main(String[] args) {

        System.out.println(frequency("AAABBCDD"));

    }

    public static String frequency (String chars){

        String result = "";

        for (int i = 0; i < chars.split("").length; i++) {
            int count = 0;
            char ch = chars.charAt(i);
            for (int j = 0; j < chars.split("").length; j++) {

                if (ch == chars.charAt(j)){
                    count++;
                }

            }

            if ( !result.contains("" + ch)  ){
                result += "" + ch + count;
            }

        }

        return result;

    }
}
