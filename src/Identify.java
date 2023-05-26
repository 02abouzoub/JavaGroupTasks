public class Identify {

    public static void  identify(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else if(number%2!=0) {
            System.out.println("Odd");
        }else{
            System.out.println("Zero");
        }

    }

    public static void main(String[] args) {
        identify(3);
    }
}


