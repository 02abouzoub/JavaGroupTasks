package week2;

public class ShirzadDivisible {

    public static void main(String[] args) {

        String divisible15 = "";
        String divisible5 = "";
        String divisible3 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0){
                divisible15 += i + " ";
            } else if (i % 5 == 0) {
                divisible5 += i + " ";
            } else if (i % 3 == 0) {
                divisible3 += i + " ";
            }

        }

        System.out.println("Divisible By " + divisible15);
        System.out.println("Divisible By " + divisible5);
        System.out.println("Divisible By " + divisible3);


    }
}
