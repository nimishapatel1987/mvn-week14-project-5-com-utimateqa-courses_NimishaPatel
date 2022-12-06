package com.utimateqa.courses.testsuite;

import com.utimateqa.courses.Pages.LoginPage;
import com.utimateqa.courses.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void usershouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enteremail("nimishapatel1987@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
    }
}
