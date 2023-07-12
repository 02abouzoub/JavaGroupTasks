package week6;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sumOfDigits("12 abc 3 hil 4 ohk 5 des"));
      sumDigits("12 abc 3 hil 4 ohk 5 des");
    }

    public  static int  sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }

    public static void sumDigits(String str) {
        String[] word = str.split(" ");
        int result = 0;

        for (String eachWord : word) {
            for (int i = 0; i < eachWord.length(); i++) {
                if (Character.isDigit(eachWord.charAt(i))) {
                    result += Integer.valueOf(eachWord);
                    break;
                }
            }
        }
        System.out.println(result);
    }

}
