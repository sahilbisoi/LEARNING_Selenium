package Gravity;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class assignment {
    @Description("Selenium automation task on an e-commerce website")
    @Test

    public void amazon(){

        WebDriver driver = new EdgeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
        signIn.click();

        WebElement email = driver.findElement(By.id("ap_email_login"));
        email.sendKeys("mastersahil1@gmail.com");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("swainreshma06");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement product = driver.findElement(By.cssSelector("div.s-main-slot div[data-component-type= 's-search-result'] h2 "));
        product.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);
        WebElement accountlist = driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(accountlist).perform();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement singOut = driver.findElement(By.xpath("//span[text()='Sign Out']"));
        singOut.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.quit();











    }
}
