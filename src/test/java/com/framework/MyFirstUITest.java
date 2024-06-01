package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MyFirstUITest {
    @Test
    void userNameIsCorrectOnOverviewTab(){
        // Arrange
        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");

        WebDriver driver = new ChromeDriver(options);
//        driver.manage().wait(500);

        String user = "TomaszHoffman";
        driver.get("https://github.com/" + user);

        // Act
    String actualUsername = driver.findElement(By.xpath("//span[@class='p-nickname vcard-username d-block']")).getText();

        // Assert
    Assert.assertEquals(user, actualUsername);

    driver.quit();

    }
}
