package e2etest.pages;

import e2etest.helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoanPage {

    private WebDriver driver;
    private SeleniumHelpers selenium;

    private By textfieldLoanAmount = By.id("amount");
    private By textfieldDownPayment = By.id("downPayment");
    private By dropdownFromAccountId = By.id("fromAccountId");
    private By buttonApplyForLoan = By.xpath("//input[@value='Apply Now']");

    public RequestLoanPage(WebDriver driver) {
        this.driver = driver;
        this.selenium = new SeleniumHelpers(driver);
    }

    public void applyForLoan(String loanAmount, String downPayment, String fromAccountId) {
        selenium.sendKeys(textfieldLoanAmount, loanAmount);
        selenium.sendKeys(textfieldDownPayment, downPayment);
        selenium.select(dropdownFromAccountId, fromAccountId);
        selenium.click(buttonApplyForLoan);
    }
}
