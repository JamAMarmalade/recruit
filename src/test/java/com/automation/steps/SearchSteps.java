package com.automation.steps;

import com.automation.actions.BrowserActions;
import com.automation.actions.CommandActions;
import com.automation.actions.SetupActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SearchSteps extends PathLocators{


    @Given("^I go to the website \"([^\"]*)\"$")
    public void i_go_to_website(String website) throws Throwable {
        BrowserActions stepActions = new BrowserActions(SetupActions.getDriver());
        stepActions.goToUrl(website);
    }

    @And("^I find and click on the link \"([^\"]*)\"$")
    public void i_find_and_click_on_the_link(String textButton) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        WebElement elem = myCommand.findLink(textButton);
        assertTrue(elem.getText().toLowerCase().contains(textButton));
        elem.click();
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String button) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        Thread.sleep(2000);
        assertTrue(myCommand.findX(myLocators(button)));
        myCommand.clickButton(myLocators(button));
    }

    @When("^I input \"([^\"]*)\" to the field \"([^\"]*)\"$")
    public void i_input_to_the_field(String input, String field) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        WebElement elem = myCommand.findInputfield(myLocators(field));
        elem.sendKeys(input);

        Thread.sleep(2000);
//        elem.sendKeys(Keys.ENTER);
    }

    @When("^I input \"([^\"]*)\" to the final field \"([^\"]*)\"$")
    public void i_input_to_the_final_field(String input, String field) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        myCommand.findX(myLocators(field));
        WebElement elem = myCommand.findInputfield(myLocators(field));
        elem.sendKeys(input);
        Thread.sleep(3000);
        elem.sendKeys(Keys.RETURN);
    }

    @Then("^I can see the link with text \"([^\"]*)\"$")
    public void i_can_see_the_link_with_text(String text) throws Throwable {
        Thread.sleep(5000);
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        List<WebElement> elem = myCommand.findLinkText(text);
        assertTrue(elem.get(0).getText().contains(text));
        String getLink = elem.get(0).getAttribute("href");
        myCommand.goToPage(getLink);
    }

    @Then("^I can view the job applications")
    public void i_can_view_the_job_applications() throws Throwable{
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());

        if(myCommand.findX(myLocators("I Accept")))
            myCommand.clickButton(myLocators("I Accept"));

        myCommand.clickButton(myLocators("Reed recent button"));
        List<String> links = new ArrayList<String>();
        int el = 0;
        Thread.sleep(5000);
        while(el  < 1){
            List<WebElement> elems = myCommand.myListElem(myLocators("Reed application"));
            for (WebElement elements : elems) {
                String tests = elements.getAttribute("href");
                links.add(tests);
            }
//            List<WebElement> elem = myCommand.findLinkText("Next");
//            elem.get(0).click();
            assertTrue(myCommand.findX(myLocators("Reed next page")));
            myCommand.clickButton(myLocators("Reed next page"));
            el++;
        }

        for(String link:links){

            FileWriter csvWriter = new FileWriter(System.getProperty("user.dir")+ "\\src\\test\\resources\\file.csv", true);
//            csvWriter.append("Job Title");
//            csvWriter.append(",");
//            csvWriter.append("Employer");
//            csvWriter.append(",");
//            csvWriter.append("Job Salary");
//            csvWriter.append(",");
//            csvWriter.append("Job type");
//            csvWriter.append(",");
//            csvWriter.append("Job Location");
//            csvWriter.append("\n");

            myCommand.goToPage(link);

            String mySalary = "null";
            String myJobTitle = "null";
            String myJobType = "null";
            String myJobLocation = "null";
            String myEmployer = "null";
            mySalary = myCommand.getText(myLocators("Salary"));
            myJobTitle = myCommand.getText(myLocators("Job title"));
            try {
                myJobType = myCommand.getText(myLocators("Job type"));
            } catch (Exception e) {
                myJobType = "Permanent";
            }
            myJobLocation = myCommand.getText(myLocators("Job location"));
            myEmployer = myCommand.getText(myLocators("Employer"));

            System.out.println(mySalary);
            System.out.println(myJobTitle);
            System.out.println(myJobType);
            System.out.println(myJobLocation);
            System.out.println(myEmployer);


            csvWriter.append(myJobTitle.replace(',', ' '));
            csvWriter.append(",");
            csvWriter.append(myEmployer.replace(',', ' '));
            csvWriter.append(",");
            csvWriter.append(mySalary.replace(',', ' '));
            csvWriter.append(",");
            csvWriter.append(myJobType.replace(',', ' '));
            csvWriter.append(",");
            csvWriter.append(myJobLocation.replace(',', ' '));
            csvWriter.append("\n");

            Thread.sleep(5000);
            csvWriter.close();
        }

    }

    @And("I click on the {string} link")
    public void iClickOnTheLink(String link) {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        WebElement elem = myCommand.findText(link);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elem.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("I click on the {string} link text")
    public void iClickOnTheLinkText(String link) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());

        Thread.sleep(3000);

        Thread.sleep(3000);
        myCommand.clickButton(myLocators("Indeed date"));

        FileWriter csvWriter = new FileWriter(System.getProperty("user.dir") + "\\src\\test\\resources\\myFile.csv", true);
        csvWriter.append("Job Title");
        csvWriter.append(",");
        csvWriter.append("Employer");
        csvWriter.append(",");
        csvWriter.append("Job Salary");
        csvWriter.append(",");
        csvWriter.append("Job type");
        csvWriter.append(",");
        csvWriter.append("Job Location");
        csvWriter.append("\n");

        Thread.sleep(10000);
        if(myCommand.findX(myLocators("Indeed pop up"))){
            myCommand.clickButton(myLocators("Indeed pop in"));
            myCommand.clickButton(myLocators("Indeed pop up"));
        }

        int i = 0;
        while(i < 2) {
            List<WebElement> elems = myCommand.myListElem(myLocators("Indeed company name"));
            Thread.sleep(3000);
            List<WebElement> title = myCommand.myListElem(myLocators("Indeed job title"));
            Thread.sleep(3000);
            List<WebElement> address = myCommand.myListElem(myLocators("Indeed address"));
            Thread.sleep(3000);
            List<WebElement> pay = myCommand.myListElem(myLocators("Indeed pay"));
            Thread.sleep(3000);
            List<WebElement> term = myCommand.myListElem(myLocators("Indeed term"));
            for (int j=0; j<elems.size(); j++) {
                System.out.println(j);
                String companyName = elems.get(j).getText();
                String jobTitle = title.get(j).getText();
                String companyAddress = address.get(j).getText();
                String jobPay;
                try {
                    jobPay = myCommand.myElem("/html/body/table[2]/tbody/tr/td/table/tbody/tr/td[1]/div[5]/div/ul/li["+j+"]/div/div[1]/div/div[1]/div/table[1]/tbody/tr/td/div[3]/div[1]/div/svg").getText();
                } catch (Exception e) {
                    jobPay = "competitive";
                }
                String jobTerm;
                try {
                    jobTerm = myCommand.myElem("/html/body/table[2]/tbody/tr/td/table/tbody/tr/td[1]/div[5]/div/ul/li["+j+"]/div/div[1]/div/div[1]/div/table[1]/tbody/tr/td/div[3]/div/div").getText();
                } catch (Exception e) {
                    jobTerm = "Permanent";
                }
                System.out.println(companyName);
                System.out.println(jobTitle);
                System.out.println(companyAddress);
                System.out.println(jobPay);
                System.out.println(jobTerm);
                csvWriter.append(jobTitle.replace(',', ' '));
                csvWriter.append(",");
                csvWriter.append(companyName.replace(',', ' '));
                csvWriter.append(",");
                csvWriter.append(jobPay.replace(',', ' '));
                csvWriter.append(",");
                csvWriter.append(jobTerm.replace(',', ' '));
                csvWriter.append(",");
                csvWriter.append(companyAddress.replace(',', ' '));
                csvWriter.append("\n");
            }
            Thread.sleep(7000);
            myCommand.clickButton(myLocators("Indeed next page"));
            i++;
        }

            csvWriter.close();
    }

    @And("I find the employer details")
    public void iFindTheEmployerDetails() throws IOException {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        String myCompanyWebsite = myCommand.myElem(myLocators("Company Website")).getAttribute("href");
        String numberOfEmployees = myCommand.getText(myLocators("Number of Employees"));
        String companyName = myCommand.myElem(myLocators("Job title")).getAttribute("title");

        System.out.println(myCompanyWebsite);
        System.out.println(numberOfEmployees);
        System.out.println(companyName);

        FileWriter csvWriter = new FileWriter(System.getProperty("user.dir")+ "\\src\\test\\resources\\newFile.csv", true);
        csvWriter.append("Company Name");
        csvWriter.append(",");
        csvWriter.append("Company Website");
        csvWriter.append(",");
        csvWriter.append("Number of Employees");
        csvWriter.append("\n");

        csvWriter.append(companyName.replace(',', ' '));
        csvWriter.append(",");
        csvWriter.append(myCompanyWebsite.replace(',', ' '));
        csvWriter.append(",");
        csvWriter.append(numberOfEmployees.replace(',', ' '));
        csvWriter.append("\n");

        csvWriter.close();
    }

    @And("I can see the link for the job")
    public void iCanSeeTheLinkForTheJob() {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
    }
}
