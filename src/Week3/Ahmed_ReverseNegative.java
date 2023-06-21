package Week3;

public class Ahmed_ReverseNegative {
    public static void main(String[] args) {

        System.out.println(reverse(-574));

        System.out.println(reverse(-2054786));


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
