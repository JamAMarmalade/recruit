package com.automation.actions;

import cucumber.api.java8.Fi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SetupActions {

    private static WebDriver driver;

    public void startBrowser() {
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriverA.exe";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=/Users/Jamzy/AppData/Local/Google/Chrome/User Data/Default/");
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
    }

    public void startBrowserG() {
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriverA.exe";
        System.setProperty("webdriver.gecko.driver", path);
        FirefoxOptions opt = new FirefoxOptions();
        opt.addArguments("start-maximised");
        driver = new FirefoxDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void quitBrowser() {
        driver.close();
//        driver.quit();
        driver = null;
    }
}
