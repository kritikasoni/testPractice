package com.kris;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by dell on 27/12/2559.
 */
public class FindRon {
    @Test
    public void findRon(){
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        webDriver.navigate().to("http://localhost/selenium/");
        List<WebElement> rows = webDriver.findElements(By.cssSelector("tbody > tr"));
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.cssSelector("td"));
            String name = columns.get(1).getText();
            if (name.equals("ron")){
                columns.get(3).click();
                WebElement message = webDriver.findElement(By.cssSelector("#message"));
                assertThat(message.getText()).isEqualTo("Woopy");
            }
        }
    }
}
