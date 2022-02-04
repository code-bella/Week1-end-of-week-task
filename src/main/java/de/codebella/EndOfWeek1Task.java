package de.codebella;

public class EndOfWeek1Task {
    public static String pwdChecker(String password) {
        if (password == "") {
            return "Error, password cannot be empty.";
        } else if (password.length() < 5) {
            return "Error, password too short.";
        }
        for (int i=0; i < password.length(); i++) {
            for (int j=0; j < 10; j++) {
                if (password.charAt(i) == j) {
                    return "Password accepted.";
                }
                return "Error, password must contain numbers.";
            }
        }
        return "Error.";
    }
}
