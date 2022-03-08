package com.personal.test.features.seleniumTest;

import com.personal.framework.base.BrowserTypes;
import com.personal.framework.base.DriverContext;
import com.personal.framework.base.FrameworkInitialize;
import com.personal.test.features.pages.HomePage;
import com.personal.test.features.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends FrameworkInitialize {

    @Before
    public void initialize() {
        InitializeBrowser(BrowserTypes.Firefox);
        DriverContext.Browser.GoToUrl("http://eaapp.somee.com");
        DriverContext.Browser.Maximize();
    }

    @Test
    public void Login() {
        CurrentPage = getInstance(HomePage.class);
        CurrentPage = CurrentPage.AS(HomePage.class).clickLogin();
        CurrentPage.AS(LoginPage.class).Login("admin", "password");
    }
}
