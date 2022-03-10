package com.personal.test.features.seleniumTest;

import com.personal.framework.base.DriverContext;
import com.personal.framework.base.FrameworkInitialize;
import com.personal.framework.config.ConfigReader;
import com.personal.framework.config.Settings;
import com.personal.framework.utilities.ExcelUtil;
import com.personal.framework.utilities.LogUtil;
import com.personal.test.features.seleniumTest.pages.HomePage;
import com.personal.test.features.seleniumTest.pages.LoginPage;
import jxl.read.biff.BiffException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class LoginTest extends FrameworkInitialize {

    @Before
    public void initialize() throws IOException {

        ConfigReader.PopulateSettings();

        //Connection conn = DatabaseUtil.Open(Settings.AUTConnectionString);
        //DatabaseUtil.ExecuteQuery("SELECT * From Employees", conn);


        LogUtil logUtil = new LogUtil();
        logUtil.CreateLogFile();
        logUtil.Write("Framework Initialize");

        InitializeBrowser(Settings.Browser);
        DriverContext.Browser.GoToUrl(Settings.AUT);
        DriverContext.Browser.Maximize();

        try {
            ExcelUtil excelUtil = new ExcelUtil(Settings.ExcelSheetPath);
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
