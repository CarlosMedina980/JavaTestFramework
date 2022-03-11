package steps;

import com.personal.framework.base.Base;
import com.personal.framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CreateEmployeePage;
import pages.EmployeeListPage;
import pages.HomePage;

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
        CurrentPage.AS(CreateEmployeePage.class).CreateEmployee(CucumberUtil.GetCellValueWithRoeIndex("Name", 1), CucumberUtil.GetCellValueWithRoeIndex("Salary", 1), CucumberUtil.GetCellValueWithRoeIndex("DurationWorked", 1), CucumberUtil.GetCellValueWithRoeIndex("Grade", 1), CucumberUtil.GetCellValueWithRoeIndex("Email", 1));

    }

    @And("I click create button")
    public void iClickCreateButton() {
        CurrentPage.AS(CreateEmployeePage.class).ClickCreateNewButton();
    }
}
