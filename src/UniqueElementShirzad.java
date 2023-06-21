public class UniqueElementShirzad {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        System.out.println(uniqueElements(str));


    }

    public static String uniqueElements(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)){
                    count++;
                }

            }

            if (count == 1){
                result += ch;
            }
        }

        return result;

    }
}
