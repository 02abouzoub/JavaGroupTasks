package week1;

public class RehinaDivision {
    public static void divide(double n1, double n2){

        int count = 0;
        while (n1 >= n2){
            n1 -= n2;
            count++;
        }

        System.out.println(count + " with a remainder of " +n1);
    }

    public static void main(String[] args){
        divide(10,3);
        divide(10,2);
        divide(10,6);
    }
}

