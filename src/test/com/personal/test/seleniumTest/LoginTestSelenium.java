package com.personal.test.seleniumTest;

import com.personal.framework.utilities.ExcelUtil;
import com.personal.test.pages.HomePage;
import com.personal.test.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTestSelenium extends SeleniumBaseTest {


    @Test
    public void Login() throws InterruptedException {
        CurrentPage = getInstance(HomePage.class);
        CurrentPage = CurrentPage.AS(HomePage.class).clickLogin();
        CurrentPage.AS(LoginPage.class).FillLoginData(ExcelUtil.ReadCell("UserName", 1), ExcelUtil.ReadCell("Password", 1));
        CurrentPage = CurrentPage.AS(LoginPage.class).ClickLogin();
        Assert.assertEquals("The User Admin did not logged in succesfully", "Hello admin!", CurrentPage.AS(HomePage.class).getUserLoggedIn());
    }
}
