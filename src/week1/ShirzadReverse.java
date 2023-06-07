package week1;

public class ShirzadReverse {

    public static void main(String[] args) {

        System.out.println(reverse(34));

        System.out.println(reverse(-3456));


    }

    public static int reverse(int number) {

        if (number < 0) {


            String num = String.valueOf(number);
            String result = "";

            for (int i = num.split("").length - 1; i > 0; i--) {
                result += num.charAt(i);
            }

            return Integer.parseInt("-" + result);
        } else {
            return 0;
        }


    }
}
