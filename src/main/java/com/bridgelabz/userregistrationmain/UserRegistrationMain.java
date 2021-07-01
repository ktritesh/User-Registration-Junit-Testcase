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
        userRegistrationMain.emailValidate();
    }

    public boolean firstNameValidate() {
        System.out.print("Enter your first name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z][a-z]{2,}", firstName));
        return false;
    }

    public boolean lastNameValidate() {
        System.out.print("Enter your last name : ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z][a-z]{2,}$", lastName));
        return false;
    }

    public boolean emailValidate() {
        System.out.print("Enter your email address : ");
        String email = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z][a-zA-Z0-9_\\-+]*[.]{0,1}[a-zA-Z0-9_\\-+]{1,}[@][a-zA-Z0-9]{1,}[.][a-zA-Z]{2,}[.]{0,}[a-zA-Z]*$", email));
        return false;
    }
}
