package com.personal.test.pages;

import com.personal.framework.base.BasePage;
import com.personal.framework.controls.elements.Button;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPage extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "Create New")
    public Button btnCreateNew;

    public CreateEmployeePage ClickCreateNewButton() {
        btnCreateNew.PerformClick();
        return getInstance(CreateEmployeePage.class);
    }
}
