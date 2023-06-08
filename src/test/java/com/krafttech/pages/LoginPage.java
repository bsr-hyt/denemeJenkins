package com.krafttech.pages;


import com.krafttech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(css ="#email" )
    public WebElement userEmailInput_loc;
    @FindBy(css = "#yourPassword")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//*[.='Login']")
    public  WebElement loginBtn_loc;


    public void login(){
        String userEmail= ConfigurationReader.get("userEmail");
        String password= ConfigurationReader.get("password");

        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        loginBtn_loc.click();
    }





}
