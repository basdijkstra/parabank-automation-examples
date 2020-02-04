package e2etest.pages;

import e2etest.helpers.SeleniumHelpers;
import org.openqa.selenium.*;

public class AccountsOverviewPage {

    private WebDriver driver;
    private SeleniumHelpers selenium;

    public AccountsOverviewPage(WebDriver driver) {
        this.driver = driver;
        this.selenium = new SeleniumHelpers(driver);
    }

    public void selectMenuItem(String menuItem) {
        selenium.click(By.linkText(menuItem));
    }
}
