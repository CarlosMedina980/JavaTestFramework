package com.personal.test.features.pages;

import com.personal.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[text() = 'Create New']")
    public WebElement btnCreateNew;
}
