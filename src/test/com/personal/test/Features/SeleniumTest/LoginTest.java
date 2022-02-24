package com.personal.test.Features.SeleniumTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

    private WebDriver _driver = null;

    @Before
    public void initialize() {
        System.setProperty("webdriver.gecko.driver", "D:\\Libs\\geckodriver.exe");
        _driver = new FirefoxDriver();
        _driver.get("https://demosite.executeautomation.com/");

    }

    @Test
    public void Login() {
        _driver.findElement(By.name("UserName")).sendKeys("admin");
        _driver.findElement(By.name("Password")).sendKeys("admin");
        _driver.findElement(By.name("Login")).submit();
    }
}
