package com.automation.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {

    private WebDriver driver;

    public BrowserActions (WebDriver driver) {
        this.driver =  driver;
    }

    public void goToUrl(String Url) {
        driver.get(Url);
    }

    public boolean correctPage(String Url) {
        return driver.getCurrentUrl().contains(Url);
    }

}
