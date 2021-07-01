package com.bridgelabz.userregistrationmain;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Testcase");
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        userRegistrationMain.firstNameValidate();
        userRegistrationMain.lastNameValidate();
    }

    public boolean firstNameValidate() {
        System.out.print("Enter your first name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z][a-z]{2,}", firstName));
        return false;
    }

    public boolean lastNameValidate() {
        System.out.print("Enter your last name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z][a-z]{2,}$", firstName));
        return false;
    }
}
