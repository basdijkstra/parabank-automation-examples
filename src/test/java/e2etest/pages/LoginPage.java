package e2etest.pages;

import e2etest.helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private SeleniumHelpers selenium;

    private By textfieldUsername = By.name("username");
    private By textfieldPassword = By.name("password");
    private By buttonDoLogin = By.xpath("//input[@value='Log In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.selenium = new SeleniumHelpers(driver);
    }

    public LoginPage load() {
        driver.get("http://parabank.parasoft.com");
        return this;
    }

    public void loginAs(String username, String password) {
        selenium.sendKeys(textfieldUsername, username);
        selenium.sendKeys(textfieldPassword, password);
        selenium.click(buttonDoLogin);
    }
}
