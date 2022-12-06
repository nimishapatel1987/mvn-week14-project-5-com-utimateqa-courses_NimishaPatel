package com.utimateqa.courses.Pages;

import com.utimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h2[@class = 'page__heading']");
    By Email = By.name("user[email]");
    By password = By.name("user[password]");
    By signinButton = By.xpath("//button[@type = 'submit']");



    public void enteremail(String userNameText){
        sendTextToElement(Email,userNameText);
    }
    public void enterPassword(String passwordText){
        sendTextToElement(password,passwordText);
    }
    public void clickOnLoginButton(){
        clickOnElement(signinButton);
    }

}
