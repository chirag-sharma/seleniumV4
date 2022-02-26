package com.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * WebDriver Manager Implementation Example
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=uaeKhfhYE0U");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Learn complete Git and Github in 1 video | Open-source Contribution | Linux commands & tricks - YouTube");


        WebElement element = driver.findElement(By.xpath("//*[@name='search_query']"));
        Thread.sleep(5000);
        element.sendKeys("Indian Army Sigma");
        WebElement element1 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        element1.click();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(5000);
        driver.close(); //kill current window
        driver.quit(); // close all windows of this session


    }
}
