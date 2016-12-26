package com.kris;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*;
/**
 * Created by dell on 26/12/2559.
 */
public class SearchSubject {
    @Test
    public void searchSubject(){
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        webDriver.navigate().to("https://www3.reg.cmu.ac.th/regist259/public/search.php");
        assertThat(webDriver.getTitle()).contains("Student Enrollment 2559");
        // click on international button
        WebElement interButton = webDriver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(4) > td > form > table:nth-child(3) > tbody > tr:nth-child(2) > td:nth-child(1) > form > input[type=\"submit\"]:nth-child(1)"));
        interButton.click();
        assertThat(webDriver.getTitle()).contains("Search");
        //click on a course
        WebElement Button = webDriver.findElement(By.cssSelector("body > div:nth-child(3) > div > div:nth-child(4)"));
        Button.click();
        webDriver.close();

    }
}
