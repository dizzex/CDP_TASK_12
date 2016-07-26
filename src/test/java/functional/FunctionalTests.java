package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FunctionalTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua/");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void googleTest() {
        driver.findElement(By.id("lst-ib")).sendKeys("rectangle");
        new Actions(driver).sendKeys(Keys.ENTER).build().perform();

        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.rc")));
        Assert.assertTrue(driver.findElements(By.cssSelector("div.rc")).size() > 0);
    }

    @Test
    public void googleTest1() {
        driver.findElement(By.id("lst-ib")).sendKeys("rectangle");
        new Actions(driver).sendKeys(Keys.ENTER).build().perform();

        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.rc")));
        Assert.assertTrue(driver.findElements(By.cssSelector("div.rc")).size() > 0);
    }
}
