package com.liquibase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css =".header.mat-elevation-z2.mat-primary.mat-toolbar.mat-toolbar-single-row .mat-button-wrapper")
    public WebElement signInMenuBtn;


    public LoginPage openLoginPage() {
        signInMenuBtn.click();
        return new LoginPage(driver);
    }


}


