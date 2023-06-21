public class ShirzadRemoveDuplicates {


    public static void main(String[] args) {

        System.out.println(result("AAABBBCCC"));

    }

    public static String result (String str){

        String res = "";

        for (int i = 0; i < str.length(); i++) {

            if( !res.contains("" + str.charAt(i)) ){
                res += str.charAt(i);
            }

        }

        return res;

    }


}
