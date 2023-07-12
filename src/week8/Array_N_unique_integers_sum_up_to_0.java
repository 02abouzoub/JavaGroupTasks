package week8;

import java.util.Arrays;

public class Array_N_unique_integers_sum_up_to_0 {

    /*
    Question 1: Array - N unique integers that sum up to 0
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(SumUpTo_0_int(4)));

    }

    public static int[] SumUpTo_0_int(int N) {

        int[] arr = new int[N];
        int sum = 0;

        boolean num;
        if (1 < N && N <100 ) {
           num = true;
        }else{
            num = false;
            System.err.println("We can't use number: " + N);
            System.exit(1);
        }

        if (true) {

            for (int i = 0; i < N-1; i++) {
                arr[i] = i; //0,1
                sum +=i; // 0+1 = 1
            }
            arr[N-1] = -sum; // las index of element == -1
                             // 0,1,-1
        }
        return arr;
    }

}

