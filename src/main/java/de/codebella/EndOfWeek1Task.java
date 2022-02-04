package de.codebella;

public class EndOfWeek1Task {
    public static String pwdChecker(String password) {
        if (password == "") {
            return "Error, password cannot be empty.";
        } else if (password.length() < 5) {
            return "Error, password too short.";
        } else if (!numberChecker(password)) {
            return "Error, password must contain a number.";
        } else if (!lowercaseLetterChecker(password)) {
            return "Error, password must contain a lowercase letter.";
        } else if (!uppercaseLetterChecker(password)) {
            return "Error, password must contain an uppercase letter.";
        }
        return "Password accepted.";
    }

    private static Boolean numberChecker(String password) {
        boolean result = false;
        for (int i=0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                result = true;
            }
        }
        return result;
    }

    private static Boolean lowercaseLetterChecker(String password) {
        boolean result = false;
        for (int i=0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                result = true;
            }
        }
        return result;
    }

    private static Boolean uppercaseLetterChecker(String password) {
        boolean result = false;
        for (int i=0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                result = true;
            }
        }
        return result;
    }
}
