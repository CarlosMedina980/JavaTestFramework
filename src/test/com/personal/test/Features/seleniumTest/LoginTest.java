package com.personal.test.Features.seleniumTest;

import com.personal.test.Features.pages.HomePage;
import com.personal.test.Features.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

    private WebDriver _driver = null;

    @Before
    public void initialize() {
        System.setProperty("webdriver.gecko.driver", "D:\\Libs\\geckodriver.exe");
        _driver = new FirefoxDriver();
        _driver.get("http://eaapp.somee.com/");

    }

    @Test
    public void Login() {
        HomePage homePage = new HomePage(_driver);
        homePage.clickLogin();
        LoginPage loginPage = new LoginPage(_driver);
        loginPage.Login("admin", "password");
    }
}
