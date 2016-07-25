package functional;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static functional.TestRunner.driver;

public class GoogleTests {
    @Given("^Anonymous user opening google home page$")
    public void anonymousUser() {
        driver.get("https://www.google.com.ua/");
    }

    @When("^User type in search bar \"([^\"]*)\" word$")
    public void userTypeInSearchBarWord(String searchWord) {
        driver.findElement(By.id("lst-ib")).sendKeys(searchWord);
        new Actions(driver).sendKeys(Keys.ENTER).build().perform();
    }

    @Then("^Search results should appear$")
    public void searchResultsShouldAppear() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.rc")));
        Assert.assertTrue(driver.findElements(By.cssSelector("div.rc")).size() > 0);
    }
}
