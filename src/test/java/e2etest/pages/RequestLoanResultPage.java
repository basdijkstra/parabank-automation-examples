package e2etest.pages;

import e2etest.helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoanResultPage {

    private WebDriver driver;
    private SeleniumHelpers selenium;

    private By textfieldApplicationResult = By.id("loanStatus");

    public RequestLoanResultPage(WebDriver driver) {
        this.driver = driver;
        this.selenium = new SeleniumHelpers(driver);
    }

    public String getLoanApplicationResult() {
        return selenium.getElementText(textfieldApplicationResult);
    }
}
