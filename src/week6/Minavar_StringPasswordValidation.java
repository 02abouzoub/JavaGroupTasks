package week6;

public class Minavar_StringPasswordValidation {

    /*
    String_PasswordValidation
Write a return method that can verify if a password is valid or not.
requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
     */

    public static void main(String[] args) {

        System.out.println(PasswordValidation("Pf2#")); // length < 6
        System.out.println(PasswordValidation("Pf2d4g #")); // contain space
        System.out.println(PasswordValidation("sd45f2#")); //without UpperCase
        System.out.println(PasswordValidation("PH34RT52#")); //without LowerCase
        System.out.println(PasswordValidation("Pfj@#%hjhHkn#")); // without Digit
        System.out.println(PasswordValidation("Pfj23hjh456Hkn")); // without SpecialChar
        System.out.println(PasswordValidation("Pf2#Tr@")); // with all
    }

    public static boolean PasswordValidation(String password) {

        if (password.length() < 6 || password.contains(" ") ){
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

    }


}
