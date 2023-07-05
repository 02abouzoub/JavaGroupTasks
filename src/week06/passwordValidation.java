package week06;

import java.util.Scanner;

public class passwordValidation {
    public static boolean passwordValidation() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your password: ");

        String password = input.next();
        boolean result = false;
        int entryCounts=0;

        while (password.length() < 6 || password.isEmpty() || password.contains(" ")) {
            System.out.println("Please enter a valid password");
            password = input.next();
            entryCounts++;
            if (entryCounts==2){
                break;
            }
        }
        int hasUpperCase=0;
        int hasLowerCase=0;
        int hasSpecialChar=0;
        int hasDigit=0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase++;
            }
            if (Character.isLowerCase(ch)) {
                hasLowerCase++;
            }
            if (Character.isDigit(ch)) {
                hasDigit++;
            }
            if (!Character.isLetterOrDigit(ch)){
                hasSpecialChar++;
            }
        }
        if(hasLowerCase<1||hasUpperCase<1||hasSpecialChar<1||hasDigit<1){

            return false;
        }
return true;

    }

    public static void main(String[] args) {
        System.out.println(passwordValidation());
    }
}
/*
2️⃣  String_PasswordValidation
Write a return method that can verify if a password is valid or not.
requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false



 */


