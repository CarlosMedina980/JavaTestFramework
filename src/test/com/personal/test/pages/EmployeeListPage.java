package com.personal.test.pages;

import com.personal.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPage extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "Create New")
    public WebElement btnCreateNew;

    public CreateEmployeePage ClickCreateNewButton() {
        btnCreateNew.click();
        return getInstance(CreateEmployeePage.class);
    }
}
