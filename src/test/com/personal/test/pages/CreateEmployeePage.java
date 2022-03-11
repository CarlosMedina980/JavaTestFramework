package com.personal.test.pages;

import com.personal.framework.base.BasePage;
import com.personal.framework.controls.elements.Button;
import com.personal.framework.controls.elements.TextBox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateEmployeePage extends BasePage {

    @FindBy(how = How.ID, using = "Name")
    public TextBox nameInput;

    @FindBy(how = How.ID, using = "Salary")
    public TextBox salaryInput;

    @FindBy(how = How.ID, using = "DurationWorked")
    public TextBox durationWorkedInput;

    @FindBy(how = How.ID, using = "Grade")
    public TextBox gradeInput;

    @FindBy(how = How.ID, using = "Email")
    public TextBox emailInput;

    @FindBy(how = How.CSS, using = ".btn-default")
    public Button createButton;

    public void CreateEmployee(String name, String salary, String durationWorked, String grade, String email) {
        nameInput.enterText(name);
        salaryInput.enterText(salary);
        durationWorkedInput.enterText(durationWorked);
        gradeInput.enterText(grade);
        emailInput.enterText(email);
    }

    public void ClickCreateNewButton() {
        createButton.click();
    }
}
