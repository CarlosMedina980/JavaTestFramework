package com.personal.test.Features.SeleniumTest;

import com.personal.test.Features.Pages.LoginPage;
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
        _driver.get("https://demosite.executeautomation.com/");

    }

    @Test
    public void Login() {
        LoginPage loginPage = new LoginPage(_driver);
        loginPage.Login("admin", "admin");
    }
}
