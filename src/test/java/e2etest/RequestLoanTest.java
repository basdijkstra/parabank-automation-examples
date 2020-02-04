package e2etest;

import e2etest.pages.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RequestLoanTest {

    private WebDriver driver;

    @Before
    public void createBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void applyForLoanWithInsufficientFunds_checkApplicationResult_shouldBeDenied() {

        new LoginPage(driver).
            load().
            loginAs("john","demo");

        new AccountsOverviewPage(driver).
            selectMenuItem("Request Loan");

        new RequestLoanPage(driver).
            applyForLoan("10000","10","12345");

        Assert.assertEquals(
            "Denied",
            new RequestLoanResultPage(driver).getLoanApplicationResult()
        );
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}
