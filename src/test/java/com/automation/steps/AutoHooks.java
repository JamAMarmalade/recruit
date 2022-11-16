package com.automation.steps;

import com.automation.actions.SetupActions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class AutoHooks {

    private SetupActions myRun = new SetupActions();
    WebDriver myDriver(){
        return myRun.getDriver();
    }

    @Before
    public void beforeScenario(){
        myRun.startBrowser();
    }

    @After
    public void afterScenario() {
        myRun.quitBrowser();
    }
}
