package com.personal.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitialize extends Base {

    public void InitializeBrowser(BrowserTypes type) {

        WebDriver Driver = null;
        switch (type) {
            case Chrome: {
                Driver = new ChromeDriver();
                break;
            }

            case Firefox: {
                System.setProperty("webdriver.gecko.driver", "D:\\Libs\\geckodriver.exe");
                Driver = new FirefoxDriver();
                break;
            }
            case IE: {
                break;
            }
        }
        //Setting Driver
        DriverContext.setDriver(Driver);
        //Setting Browser
        DriverContext.Browser = new Browser(Driver);
    }
}
