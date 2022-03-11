package com.personal.test.pages;

import com.personal.framework.base.BasePage;
import com.personal.framework.controls.elements.Button;
import com.personal.framework.controls.elements.HyperLink;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.ID, using = "loginLink")
    public Button btnLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public Button btnEmployeeList;

    @FindBy(how = How.XPATH, using = "//a[@title='Manage']")
    public HyperLink lnkUserName;

    public LoginPage clickLogin() {
        btnLogin.PerformClick();
        return getInstance(LoginPage.class);
    }

    public EmployeeListPage clickEmployeeList() throws InterruptedException {
        btnEmployeeList.PerformClick();
        Thread.sleep(2000);
        return getInstance(EmployeeListPage.class);
    }

    public boolean isLoginButtonDisplayed() {
        return btnLogin.isDisplayed();
    }

    public String getUserLoggedIn() {
        return lnkUserName.getText();
    }
}

