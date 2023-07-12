package week6;

public class Maximum {

    public static void main(String[] args) {


    }
    public static int findMaximum(int[] numbers) {

        int max = numbers[0]; // Initialize max with the first element of the array

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger number is found
            }
        }

        return max;
    }

  /*  int[] numbers = { 5, 2, 9, 7, 1 };
    int maximum = findMaximum(numbers);
System.out.println("Maximum number: " + maximum);

   */



}
