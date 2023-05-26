package week1;

public class IsraaEvenOrOdd {
    public static void main(String[] args) {
        Identify(-1);
    }

    public static void Identify(int num) {

        String result =  (num % 2 == 0)? "\"Even\"": "\"Odd\"";

        System.out.println(result);

    }
}
