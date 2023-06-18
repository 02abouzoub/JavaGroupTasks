package week04;

public class removeDup {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));


    }

    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(ch + "")) {
                result += ch;
            } else {
                continue;
            }

        }
        return result;
    }
}

/*

➡️ String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

 */
