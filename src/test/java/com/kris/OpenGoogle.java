package com.kris;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dell on 26/12/2559.
 */
public class OpenGoogle {
    @Test
    public void openGoogle(){
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        webDriver.navigate().to("http://www.google.com");
    }
}
