public class ReverseNegativeNumber_salem {
    public static void main(String[] args) {

        String num = "-35";
        String reverse = "";

        for (int i = num.length()-1; i >= 1; i--) {

            char ch = num.charAt(i);


            reverse+= ""+ch ;
        }
        System.out.println("-"+reverse);
             }

        }



    /*
     2) Number - Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
 Input: -35  output: -53
     */