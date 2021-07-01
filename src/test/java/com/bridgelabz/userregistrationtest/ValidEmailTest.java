package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistrationmain.UserRegistrationMain;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String emailTest;
    private boolean expectedResult;

    public ValidEmailTest(String emailTest, boolean expectedResult) {
        this.emailTest = emailTest;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] { {"abc@yahoo.com", true}});
    }

    @Test
    public void givenEmailAsVar_ShouldReturnTrueorFalse() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.emailValidate();
    }
}
