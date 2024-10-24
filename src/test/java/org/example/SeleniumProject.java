package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumProject {
    @Test

    public void awesomeQA(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("Sahil");
        driver.findElement(By.name("lastname")).sendKeys("Bisoi");
        driver.findElement(By.id("input-email")).sendKeys("123abcZxcasd@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("1234556677");
        driver.findElement(By.id("input-password")).sendKeys("pass123");
        driver.findElement(By.id("input-confirm")).sendKeys("pass123");
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();

       if(driver.getPageSource().contains("Your Account Has Been Created")){
            System.out.println("Success");
       } else {
            System.out.println("FAILED");
        }
       driver.quit();
    }
}
