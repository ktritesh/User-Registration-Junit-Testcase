package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistrationmain.UserRegistrationMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.firstNameValidate();
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.lastNameValidate();
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue(){
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.emailValidate();
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.mobileNumberValidate();
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.passwordValidate();
        Assertions.assertTrue(result);
    }
}
