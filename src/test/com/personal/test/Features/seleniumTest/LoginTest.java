package com.personal.test.Features.seleniumTest;

import com.personal.framework.base.Base;
import com.personal.framework.base.DriverContext;
import com.personal.test.Features.pages.HomePage;
import com.personal.test.Features.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest extends Base {

    @Before
    public void initialize() {
        System.setProperty("webdriver.gecko.driver", "D:\\Libs\\geckodriver.exe");
        DriverContext.Driver = new FirefoxDriver();
        DriverContext.Driver.get("http://eaapp.somee.com/");

    }

    @Test
    public void Login() {
        CurrentPage = getInstance(HomePage.class);
        CurrentPage = CurrentPage.AS(HomePage.class).clickLogin();
        CurrentPage.AS(LoginPage.class).Login("admin", "password");
    }
}
