package com.personal.test.features.seleniumTest;

import com.personal.framework.base.BrowserTypes;
import com.personal.framework.base.DriverContext;
import com.personal.framework.base.FrameworkInitialize;
import com.personal.framework.utilities.DatabaseUtil;
import com.personal.framework.utilities.ExcelUtil;
import com.personal.framework.utilities.LogUtil;
import com.personal.test.features.seleniumTest.pages.HomePage;
import com.personal.test.features.seleniumTest.pages.LoginPage;
import jxl.read.biff.BiffException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;

public class LoginTest extends FrameworkInitialize {

    @Before
    public void initialize() {

        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=EmployeeDB;encrypt=true;trustServerCertificate=true;user=sa;password=abc123";
        Connection conn = DatabaseUtil.Open(connectionUrl);

        DatabaseUtil.ExecuteQuery("SELECT * From Employees", conn);

        
        LogUtil logUtil = new LogUtil();
        logUtil.CreateLogFile();
        logUtil.Write("Framework Initialize");

        InitializeBrowser(BrowserTypes.Firefox);
        DriverContext.Browser.GoToUrl("http://eaapp.somee.com");
        DriverContext.Browser.Maximize();

        try {
            ExcelUtil excelUtil = new ExcelUtil("D:\\JavaTestFramework\\JavaTestFramework\\logintestdata.xls");
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Login() {
        CurrentPage = getInstance(HomePage.class);
        CurrentPage = CurrentPage.AS(HomePage.class).clickLogin();
        //ddt test login
        CurrentPage.AS(LoginPage.class).Login(ExcelUtil.ReadCell("UserName", 1), ExcelUtil.ReadCell("Password", 1));
    }

    @After
    public void Teardown() {
        DriverContext.Browser.Close();
    }
}
