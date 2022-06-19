package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        //Alert alert = driver.switchTo().alert();
        //alert.accept();

        WebElement categoryCombo = driver.findElement(By.className(".mpof_5r mpof_ki_s mp7g_oh m389_6m mjyo_6x mse2_40 mp4t_0 mr3m_0 mli2_0 mx7m_1 m911_co mnyp_co mdwl_co mefy_5r msts_pt mlkp_6x _535b5_PqNDg")));
        Select category = new Select(categoryCombo);
        category.selectByIndex(3);

        WebElement inputField = driver.findElement(By.className(".msts_pt mgmw_wo mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_6x mefy_5r mldj_0 mm2b_0 ozg4u mh85_0 _535b5_nwl41")));
        inputField.sendKeys("mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        List<WebElement> elements = driver.findElements(By.cssSelector("#article"));
        elements.get(0).getText();


    }
}
