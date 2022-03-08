package com.personal.test.Features.pages;

import com.personal.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "loginLink")
    public WebElement btnLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement btnEmployeeList;

    public void clickLogin() {
        btnLogin.click();
    }
}

