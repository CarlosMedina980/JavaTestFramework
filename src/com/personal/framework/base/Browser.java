package com.personal.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser {

    public WebDriver _driver;
    public BrowserTypes type;

    public Browser(WebDriver driver) {
        this._driver = driver;
    }

    public void GoToUrl(String url) {
        _driver.get(url);
    }

    public void Maximize() {
        _driver.manage().window().maximize();
    }
}

