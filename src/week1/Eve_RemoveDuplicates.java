package week1;

public class Eve_RemoveDuplicates {

    public static  String  removeDuplicate( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);

        return result;
    }

}
