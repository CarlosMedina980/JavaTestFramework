package com.personal.test.pages;

import com.personal.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.ID, using = "loginLink")
    public WebElement btnLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement btnEmployeeList;

    @FindBy(how = How.XPATH, using = "//a[@title='Manage']")
    public WebElement lnkUserName;

    public LoginPage clickLogin() {
        btnLogin.click();
        return getInstance(LoginPage.class);
    }

    public EmployeeListPage clickEmployeeList() {
        btnEmployeeList.click();
        return getInstance(EmployeeListPage.class);
    }

    public boolean isLoginButtonDisplayed() {
        return btnLogin.isDisplayed();
    }

    public String getUserLoggedIn() {
        return lnkUserName.getText();
    }
}

