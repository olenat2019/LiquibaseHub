package com.liquibase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    protected WebDriver driver;
    protected UserPage user;
    protected WebDriverWait wait;





    @BeforeTest
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Lena/IdeaProjects/drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://hub-staging.liquibase.com/landing-page");
        driver.manage().window().maximize();
        user = new UserPage();
        wait = new WebDriverWait(driver,15);





    }

    @AfterTest
    public void close() {
        driver.quit();
    }

}
