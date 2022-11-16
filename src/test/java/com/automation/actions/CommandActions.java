package com.automation.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommandActions {

    private WebDriver driver;

    /**
     * To use this class you need to have an web diver
     * @param driver of type WebDriver
     */
    public CommandActions(WebDriver driver) {
        this.driver = driver;
    }

    public void sendString(String path, String field) {
        driver.findElement(By.xpath(path)).sendKeys(field);
        driver.findElement(By.xpath(path)).sendKeys(Keys.ENTER);
    }

    public void clickButton(String path) {
        driver.findElement(By.xpath(path)).click();
    }

    public String getText(String path) {
        return driver.findElement(By.xpath(path)).getText();
    }

    public WebElement myElem(String path) {
        return driver.findElement(By.xpath(path));
    }

    public List<WebElement> myListElem(String path){
        return driver.findElements(By.xpath(path));
    }

    public WebElement myCss(String path) {
        return driver.findElement(By.cssSelector(path));
    }

    public void dropDown(String path, String value) {
        WebElement serviceRef =  driver.findElement(By.xpath(path));
        Select dropdown = new Select(serviceRef);
//        dropdown.deselectAll();
        dropdown.selectByValue(value);
    }

    public boolean findX(String path) {
        boolean findEle = true;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
        }
        catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("could not find element");
            findEle = false;
        }
        return findEle;
    }

    public WebElement findLink(String text) {
        List<WebElement> myList = driver.findElements(By.xpath("//*[@href]"));
        WebElement myText = null;
        int i = 0;
        while(i<myList.size()){
//            System.out.println(myList.get(i).getText().toLowerCase());
            if(myList.get(i).getText().toLowerCase().equals(text)) {
                myText = myList.get(i);
                i = myList.size();
            }
            i++;
        }
        return myText;
    }

    public List<WebElement> findLinkText(String text) {
        List<WebElement> myList = driver.findElements(By.xpath("//a[contains(text(), '"+text+"')]"));
        WebElement myText = null;
        int i = 0;
        while(i<myList.size()){
//            System.out.println(myList.get(i).getText().toLowerCase());
            if(myList.get(i).getText().toLowerCase().equals(text)) {
                myText = myList.get(i);
                i = myList.size();
            }
            i++;
        }
        return myList;
    }

    public WebElement findText(String text) {
        List<WebElement> myList = driver.findElements(By.xpath("//a[@class='app-aware-link' and text()='"+ text +"']"));
        WebElement myText = null;
        int i = 0;
        while(i<myList.size()){
            if(myList.get(i).isDisplayed()){
                myText = myList.get(i);
                i = myList.size();
            }
            i++;
        }
        return myText;
    }

    public WebElement findJob(String text) {
        List<WebElement> myList = driver.findElements(By.xpath("//a[contains(@class, 'jcs-JobTitle')]"));
        WebElement myText = null;
        int i = 0;
        while(i<myList.size()){
            if(myList.get(i).isDisplayed()){
                myText = myList.get(i);
                i = myList.size();
            }
            i++;
        }
        System.out.println(i);
        System.out.println(myText);
        return myText;
    }

    public WebElement findInputfield(String field) throws InterruptedException {
        List<WebElement> myList = driver.findElements(By.xpath(field));
        WebElement myText = null;
        int i = 0;
        while(i<myList.size()){
            if(myList.get(i).isDisplayed()){
                myText = myList.get(i);
                i = myList.size();
            }
            i++;
        }
        return myText;
    }

    public void scrollFind(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void goToPage(String Url) {
        driver.get(Url);
    }



}
