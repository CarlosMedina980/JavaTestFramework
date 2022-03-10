package com.personal.test.pages;

import com.personal.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateEmployeePage extends BasePage {

    @FindBy(how = How.ID, using = "Name")
    public WebElement nameInput;

    @FindBy(how = How.ID, using = "Salary")
    public WebElement salaryInput;

    @FindBy(how = How.ID, using = "DurationWorked")
    public WebElement durationWorkedInput;

    @FindBy(how = How.ID, using = "Grade")
    public WebElement gradeInput;

    @FindBy(how = How.ID, using = "Email")
    public WebElement emailInput;

    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement createButton;

    public void CreateEmployee(String name, String salary, String durationWorked, String grade, String email) {
        nameInput.sendKeys(name);
        salaryInput.sendKeys(salary);
        durationWorkedInput.sendKeys(durationWorked);
        gradeInput.sendKeys(grade);
        emailInput.sendKeys(email);
    }

    public void ClickCreateNewButton() {
        createButton.click();
    }
}
