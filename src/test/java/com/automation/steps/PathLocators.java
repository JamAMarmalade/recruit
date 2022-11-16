package com.automation.steps;

public class PathLocators {

    public String myLocators(String myElement){

        String myXpath;
        switch (myElement) {
            case "Gym tab":
                myXpath = "//a[@id='0000014c-faaa-d922-a7ed-fbef5a7f0000']";
                break;
            case "Go to Search":
                myXpath = "//a[@href='https://www.nuffieldhealth.com/gyms'";
                break;
            case "Search Gym":
                myXpath = "//input[@id='location-finder__input-00000160-4eeb-de17-a579-dffb7ab70000'";
                break;
            case "Allow Cookies":
                myXpath = "//button[@id='CybotCookiebotDialogBodyButtonAccept']";
                break;
            case "Role":
                myXpath = "//input[@name='role']";
                break;
            case "Location":
                myXpath = "//input[@aria-label='Location search']";
                break;
            case "Search Job":
                myXpath = "//button[text()='Search jobs']";
                break;
            case "Job card":
                myXpath = "//class=[@col-xs-12 col-sm-8 col-md-9]";
                break;
            case "I Accept":
                myXpath = "//button[@id='onetrust-accept-btn-handler']";
                break;
            case "Salary":
                myXpath = "//*[@data-qa='salaryLbl']";
                break;
            case "Job title":
                myXpath = "//h1";
                break;
            case "Job type":
                myXpath = "//*[@data-qa='jobTypeLbl']";
                break;
            case "Job location":
                myXpath = "//*[@data-qa='localityLbl']";
                break;
            case "Employer":
                myXpath = "//*[@id='content']/div[1]/div[2]/article/div/header/div[1]/div/span/a/span";
                break;
            case "Email field":
                myXpath = "//input[@id='session_key']";
                break;
            case "Password field":
                myXpath = "//input[@id='session_password']";
                break;
            case "Skip":
                myXpath = "//button[@type='button']";
                break;
            case "Agree":
                myXpath = "//button[@data-tracking-control-name='homepage-basic_signin-form_submit-button']";
                break;
            case "Employer search":
                myXpath = "//input[@placeholder='Search']";
                break;
            case "Company Website":
                myXpath = "//a[@rel='noopener noreferrer']";
                break;
            case "Number of Employees":
                myXpath = "//*[@class='org-top-card-secondary-content__see-all t-normal t-black--light link-without-visited-state link-without-hover-state']";
                break;
            case "Employee role":
                myXpath = "//*[@class='text-body-medium break-words']";
                break;
            case "Indeed Role":
                myXpath = "//input[@id='text-input-what']";
                break;
            case "Indeed Location":
                myXpath = "//input[@id='text-input-where']";
                break;
            case "Indeed job search":
                myXpath = "//button[@type='submit']";
                break;
            case "Indeed company name" :
                myXpath = "//*[@class='companyName']";
                break;
            case "Indeed job title":
                myXpath = "//a[contains(@class, 'jcs-JobTitle')]";
                break;
            case "Indeed company":
                myXpath = "//*[@class='jobsearch-InlineCompanyRating icl-u-xs-mt--xs icl-u-xs-mb--md']//a";
                break;
            case "Indeed address":
                myXpath = "//*[@class='companyLocation']";
                break;
            case "Indeed pay":
                myXpath = "//*[class='metadata salary-snippet-container']";
                break;
            case "Indeed term":
                myXpath = "//*[class='attribute_snippet']";
                break;
            case "Reed application":
                myXpath = "//*[contains(@id, 'jobSection')]/div/div[1]/header/h3/a";
                break;
            case "Reed next page":
                myXpath = "/html/body/div[1]/div/div[5]/div[1]/div[3]/div[2]/div[1]/div[2]/div/div/a[6]/span/span";
                break;
            case "Indeed next page":
                myXpath = "//*[@id='resultsCol']/nav/div/ul/li[6]/a";
                break;
            case "Reed recent button":
                myXpath = "//*[@id='content']/div[1]/div[3]/div[1]/div[1]/div[2]/div/p/a[2]";
                break;
            case "Indeed date":
                myXpath = "/html/body/table[2]/tbody/tr/td/table/tbody/tr/td[1]/div[3]/div[4]/div[1]/span[2]/a";
                break;
            case "Indeed reject":
                myXpath = "//button[@id='onetrust-reject-all-handler']";
                break;
            case "Indeed pop in":
                myXpath = "//*[@id='google-Only-Modal']/div/div[1]/button";
                break;
            case "Indeed pop up":
                myXpath = "//*[@id='popover-x']/button";
                break;

            default:
                throw new RuntimeException("==> cannot find the xpath for the element: " + myElement);
        }
        return myXpath;
    }

}
