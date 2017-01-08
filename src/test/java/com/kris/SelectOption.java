package com.kris;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
/**
 * Created by dell on 8/1/2560.
 */
public class SelectOption {
    @Test
    public void selectOption() {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://localhost/selenium/");
        Select selectUser = new Select(webDriver.findElement(By.cssSelector("#select-user")));
        assertThat(selectUser).isNotNull();//ตไม่ต้องเช็คก็ได้ ้องมี search bar
        assertThat(selectUser.getOptions().size()).isEqualTo(5);
        selectUser.selectByValue("ron");
        WebElement row = webDriver.findElement(By.cssSelector("tbody > tr"));
        assertThat(row).isNotNull();
        List<WebElement> columns = row.findElements(By.cssSelector("td"));
        columns.get(3).findElement(By.cssSelector("button")).click();
        System.out.println(columns.get(3).getText());
        WebElement message = webDriver.findElement(By.cssSelector("#message"));
        assertThat(message.getText()).isEqualTo("Woopy");

    }
}
