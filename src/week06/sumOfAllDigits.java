package week06;

import java.util.Arrays;

public class sumOfAllDigits {

    public static int sumOfAllDigits(String str) {

        int sum = 0;
        String currentNumber = "";

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber += ch;
                    } else {
                        if (!currentNumber.isEmpty()) {
                            sum += Integer.parseInt(currentNumber);
                          currentNumber = "";

                            //System.out.println(sum);
                        }
                    }
                }
             if (!currentNumber.isEmpty()) {
                 sum += Integer.parseInt(currentNumber);
                }

                return sum;
            }
            public static int digitsOnly(String str){
                int result=0;
                String numbers="";

                for (char each: str.toCharArray()){
                    if (Character.isDigit(each)){
                        numbers+= each;
                    }else {
                        numbers+=" ";
                    }
                }
                for (String n: numbers.split("\\s+"))
                       result+= Integer.parseInt(n);

            return result;}
    public static int sumOfDigitsRegex(String input) {
        String digitsOnly = input.replaceAll("[^-\\d]+", " ");
        int result = 0;
        for (String s : digitsOnly.split(" ")) {
            result += Integer.parseInt(s);
        }
        return result;
    }
            public static void main(String[] args) {
                String str = "12 java 5 apple 3";
                int sumOfDigits = sumOfAllDigits(str);
                System.out.println("sumOfDigits = " + sumOfDigits);
                System.out.println("---------------------------------------");
                System.out.println("digitsOnly(str) = " + digitsOnly(str));
                System.out.println("---------------------------------------");
                System.out.println("sumOfDigitsRegex(str) = " + sumOfDigitsRegex(str));
            }
        }





        //       if (Character.isDigit(Integer.parseInt(arr[i]))) {




/*
📌 Java Coding Tasks - Week 6📌  <@&1050512057746870339>

1️⃣  String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20




 */