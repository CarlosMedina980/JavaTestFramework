package com.personal.test.features.seleniumTest.pages;

import com.personal.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.ID, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.CSS, using = "[Class='btn btn-default']")
    public WebElement btnLogin;

    public void Login(String user, String password) {
        txtUserName.sendKeys(user);
        txtPassword.sendKeys(password);
        btnLogin.submit();
    }
}
