package com.personal.test.features.seleniumTest;

import com.personal.framework.utilities.ExcelUtil;
import com.personal.test.features.seleniumTest.pages.HomePage;
import com.personal.test.features.seleniumTest.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {


    @Test
    public void Login() {
        CurrentPage = getInstance(HomePage.class);
        CurrentPage = CurrentPage.AS(HomePage.class).clickLogin();
        CurrentPage.AS(LoginPage.class).Login(ExcelUtil.ReadCell("UserName", 1), ExcelUtil.ReadCell("Password", 1));
    }
}
