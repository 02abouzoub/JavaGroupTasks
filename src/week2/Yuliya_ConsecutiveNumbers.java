package week2;

public class Yuliya_ConsecutiveNumbers {
    public static void main(String[] args) {

        int n = 45;

        for (int i = 1; i < n; i++) {
            String result = "";

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0) {
                    result += "Codility";
                }
                if (i % 3 == 0) {
                    result += "Test";
                }
                if (i % 5 == 0) {
                    result += "Coders";
                } else {
                    result += i + " ";
                }

                System.out.println(result);

            }

        }
    }
}