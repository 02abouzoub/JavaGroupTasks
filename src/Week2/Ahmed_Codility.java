package Week2;

public class Ahmed_Codility {
    public static void main(String[] args) {

        int n = 45;

        for (int i = 1; i < n; i++) {

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                if (i % 2 == 0){
                    System.out.print("Codility");
                }

                if (i % 3 == 0){
                    System.out.print("Test");
                }

                if (i % 5 == 0){
                    System.out.print("Coders");
                }
                System.out.println();
            } else {
                System.out.println(i + " ");
            }


        }


    }
}