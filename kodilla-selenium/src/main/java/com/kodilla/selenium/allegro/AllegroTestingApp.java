package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        //Alert alert = driver.switchTo().alert();
        //alert.accept();

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@data-role=\"header-wrapper\"]/div/span/div/select"));
        Select category = new Select(categoryCombo);
        category.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//*[@name=\"string\"]"));
        inputField.sendKeys("mavic mini");
        inputField.submit();
    }
}
