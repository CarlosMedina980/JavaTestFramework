package com.personal.framework.base;

import com.personal.framework.config.Settings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverContext {

    public static WebDriver Driver;

    public static Browser Browser;

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }

    public static void WaitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver;

        ExpectedCondition<Boolean> jsLoad = webDriver -> ((JavascriptExecutor) Driver)
                .executeScript("return document.readyState").toString().equals("complete");

        boolean jsReady = jsExecutor.executeScript("return document.readyState").toString().equals("complete");

        if (!jsReady) {
            wait.until(jsLoad);
        } else {
            Settings.Logs.Write("Page is loaded");
        }
    }

    public static void WaitForElementVisible(final WebElement elementFindBy) {
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        wait.until(ExpectedConditions.visibilityOf(elementFindBy));
    }

    public static void WaitForElementTextToBeVisible(final WebElement elementFindBy, String text) {
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(elementFindBy, text));
    }

    
}
