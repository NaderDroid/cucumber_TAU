import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefs {


    private WebDriver driver;
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector(".login .button");
    @Given("Customer In the login page of parabank website")
    public void customerInTheLoginPageOfParabankWebsite() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        
    }

    @When("Customer enters valid credentials")
    public void customerEntersValidCredentials() {
        driver.findElement(usernameField).sendKeys("taudroid");
        driver.findElement(passwordField).sendKeys("nader");
        driver.findElement(loginButton).click();
    }

    @Test
    @Then("Customer should be landed in the overview page and see the logout button")
    public void customerShouldBeLandedInTheOverviewPageAndSeeTheLogoutButton() {

    }
}
