package week6;

public class Maximum {

    public static void main(String[] args) {


    }
    public static int maxValue( int[]  n ) {
        int max = Integer.MIN_VALUE;
        for(int each: n)
            if(each > max)
                max = each;

        return max;
    }

}
