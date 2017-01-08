package com.kris;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dell on 26/12/2559.
 */
public class Type {
    @Test
    public void openGoogle(){
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        webDriver.navigate().to("http://www.google.com");
       WebElement element = webDriver.findElement(By.name("q"));
        element.sendKeys("Google");
        element.submit();

    }
}