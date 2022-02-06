package de.codebella;

import java.lang.reflect.Array;

public class EndOfWeek1Task {
    public static String[] pwdChecker(String[] password, int minPwdLength) {
        String[] results = new String[Array.getLength(password)];
        for(int j = 0; j < Array.getLength(password); j++) {
            if (password[j] == "") {
                results[j] = "Error, password cannot be empty.";
            } else if (password[j].length() < minPwdLength) {
                results[j] = "Error, password too short.";
            } else if (!numberChecker(password[j])) {
                results[j] = "Error, password must contain a number.";
            } else if (!lowercaseLetterChecker(password[j])) {
                results[j] = "Error, password must contain a lowercase letter.";
            } else if (!uppercaseLetterChecker(password[j])) {
                results[j] = "Error, password must contain an uppercase letter.";
            }
            if (results[j] == null) {
                results[j] = "Password accepted.";
            }
        }
        return results;
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
