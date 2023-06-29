package week6;

public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(PassWordvalidation("EveSteel123!"));

    }

  /*  public static boolean PassWordvalidation(String password) {
      //  String lowercase="(.*[a-z].*)";
       // String uppercase="(.*[A-Z].*)";
        String numbers="1234567890";
        String specialchars="!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";



        boolean HasLower = !password.equals(password.toUpperCase()),
                HasUpper = !password.equals(password.toLowerCase()),
                HasDigits = password.equals(numbers),
                HasSpecial = password.equals(specialchars),
                Valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUpper && HasDigits && HasSpecial)
                Valid = true;
        return Valid;
    }

   */

    public static boolean PassWordvalidation(String password) {
        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";

        boolean  HasLower = password.matches(lowercase),
                HasUppere = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;
        return Valid;


    }
}