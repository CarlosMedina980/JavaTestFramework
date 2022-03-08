package com.personal.test.Features.pages;

import com.personal.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.ID, using = "loginLink")
    public WebElement btnLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement btnEmployeeList;

    public LoginPage clickLogin() {
        btnLogin.click();
        return getInstance(LoginPage.class);
    }

    public EmployeeListPage clickEmployeeList() {
        btnEmployeeList.click();
        return getInstance(EmployeeListPage.class);
    }
}

