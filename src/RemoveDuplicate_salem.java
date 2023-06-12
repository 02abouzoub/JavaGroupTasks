public class RemoveDuplicate_salem {

    public static void main(String[] args) {

        String str ="AAABBBCCC";
        System.out.println(removeDuplicate("AAABBBCCC"));
    }

    public static String removeDuplicate (String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!result.contains(ch + "")) {
                result += ch;
            }

        }
        return result;
    }

}
