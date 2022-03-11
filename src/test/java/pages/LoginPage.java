package pages;

import com.personal.framework.base.BasePage;
import com.personal.framework.base.DriverContext;
import com.personal.framework.controls.elements.Button;
import com.personal.framework.controls.elements.TextBox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "UserName")
    public TextBox txtUserName;

    @FindBy(how = How.ID, using = "Password")
    public TextBox txtPassword;

    @FindBy(how = How.CSS, using = "[Class='btn btn-default']")
    public Button btnLogin;

    public void FillLoginData(String user, String password) {
        txtUserName.enterText(user);
        txtPassword.enterText(password);

    }

    public HomePage ClickLogin() {
        btnLogin.PerformClick();
        DriverContext.WaitForPageToLoad();
        return getInstance(HomePage.class);
    }
}
