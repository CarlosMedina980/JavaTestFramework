package com.personal.test.seleniumTest;

import com.personal.framework.base.DriverContext;
import com.personal.framework.base.FrameworkInitialize;
import com.personal.framework.config.ConfigReader;
import com.personal.framework.config.Settings;
import com.personal.framework.utilities.DatabaseUtil;
import com.personal.framework.utilities.ExcelUtil;
import com.personal.framework.utilities.LogUtil;
import jxl.read.biff.BiffException;
import org.junit.Before;

import java.io.IOException;
import java.sql.Connection;

public class SeleniumBaseTest extends FrameworkInitialize {

    @Before
    public void initialize() throws IOException {

        //Initialize Config
        ConfigReader.PopulateSettings();

        //Initialize Logger
        Settings.Logs = new LogUtil();
        Settings.Logs.CreateLogFile();
        Settings.Logs.Write("Logger Initialized");

        //Initialize connection to DB
        Connection conn = DatabaseUtil.Open(Settings.AUTConnectionString);
        Settings.Logs.Write("Created Database Connection");

        //Initialize Browser
        InitializeBrowser(Settings.Browser);
        Settings.Logs.Write("Initialized Browser: " + Settings.Browser);
        DriverContext.Browser.GoToUrl(Settings.AUT);
        Settings.Logs.Write("Redirected to Url: " + Settings.AUT);
        DriverContext.Browser.Maximize();

        try {
            ExcelUtil excelUtil = new ExcelUtil(Settings.ExcelSheetPath);
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
