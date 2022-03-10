package com.personal.test.steps;

import com.personal.framework.base.Base;
import com.personal.test.pages.HomePage;
import com.personal.test.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class LoginSteps extends Base {

    @Given("I see application has loaded")
    public void iSeeApplicationHasLoaded() {
        CurrentPage = getInstance(HomePage.class);
        Assert.assertTrue("The Login Page Was Not Loaded Properly", CurrentPage.AS(HomePage.class).isLoginButtonDisplayed());
    }

    @And("I click login link")
    public void iClickLoginLink() {
        CurrentPage = CurrentPage.AS(HomePage.class).clickLogin();
    }

    @And("I enter Username and Password")
    public void iEnterUsernameAndPassword(DataTable data) {
        List<List<String>> table = data.cells();
        CurrentPage.AS(LoginPage.class).FillLoginData(table.get(1).get(0).toString(), table.get(1).get(1));
    }

    @When("I click Login button")
    public void iClickLoginButton() {
        CurrentPage = CurrentPage.AS(LoginPage.class).ClickLogin();
    }

    @Then("I should see the user name which logged in")
    public void iShouldSeeTheUserNameWhichLoggedIn() {
        Assert.assertEquals("The User Was not Logged in Correctly", "Hello admin!", CurrentPage.AS(HomePage.class).getUserLoggedIn());
    }
}