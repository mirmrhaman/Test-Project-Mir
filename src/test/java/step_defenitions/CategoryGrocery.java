package step_defenitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CategoryGrocery {
    private static final By Category = By.xpath("//span[text()='Categories']");
    private static final By Grocery = By.xpath("//*[@id='5xt1a']/a/div");

    private static final Logger LOGGER = LogManager.getLogger(CategoryGrocery.class);
    WebDriver driver;

    @Given("^Open the target home page$")
    public void navigateToHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ActOn.browser(driver).openBrowser("https://www.target.com/");
        LOGGER.info("User is in Target home page");
    }

    @When("^User click on category$")
    public void userClickOnCategory() {
        ActOn.element(driver, Category).click();
        LOGGER.info("User click on category");
    }

    @When("^User click on grocery$")
    public void clickOnCategory() {
        ActOn.element(driver,Grocery).click();
        LOGGER.info("User click on grocery");
    }

    @Then("^user is navigate to a scroll box$")
    public void openScrollBox() {
        LOGGER.info("User is in the grocery list");
    }
}
