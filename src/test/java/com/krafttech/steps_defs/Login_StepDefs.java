package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        // System.out.println("Open browser and navigate to login page");
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("The user enters valid credentials that belongs to Mike")
    public void the_user_enters_valid_credentials_that_belongs_to_Mike() {
        // System.out.println("Enter valid credentials that belongs to Mike");
        loginPage.login();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //  System.out.println("verify that user successfully logs in");
        Assert.assertTrue(dashboardPage.dashboardPageSubTitle.isDisplayed());
    }





}
