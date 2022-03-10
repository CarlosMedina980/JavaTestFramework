package com.personal.test.steps;

import com.personal.framework.base.Base;
import com.personal.framework.utilities.CucumberUtil;
import com.personal.test.pages.CreateEmployeePage;
import com.personal.test.pages.EmployeeListPage;
import com.personal.test.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EmployeeSteps extends Base {
    @And("I click employeeList link")
    public void iClickEmployeeListLink() throws InterruptedException {
        CurrentPage = CurrentPage.AS(HomePage.class).clickEmployeeList();
    }

    @And("I click createnew button")
    public void iClickCreatenewButton() {
        CurrentPage = CurrentPage.AS(EmployeeListPage.class).ClickCreateNewButton();
    }

    @When("I enter following details")
    public void iEnterFollowingDetails(DataTable data) {
        CucumberUtil.ConvertDataTableToDict(data);
        CurrentPage.AS(CreateEmployeePage.class).CreateEmployee(CucumberUtil.getCellValue("Name"), CucumberUtil.getCellValue("Salary"),
                CucumberUtil.getCellValue("DurationWorked"), CucumberUtil.getCellValue("Grade"), CucumberUtil.getCellValue("Email"));

    }

    @And("I click create button")
    public void iClickCreateButton() {
        CurrentPage.AS(CreateEmployeePage.class).ClickCreateNewButton();
    }
}
