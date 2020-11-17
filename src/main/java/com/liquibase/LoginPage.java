package com.liquibase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".visible-lg div:nth-child(3) .inputField-customizable")
    public WebElement userNameField;

    @FindBy(css = ".background-customizable.modal-content.modal-content-mobile.visible-lg.visible-md form[name='cognitoSignInForm']  input#signInFormPassword")
    public WebElement passwordField;

    @FindBy(css = ".visible-lg .submitButton-customizable")
    public WebElement signInBtn;

    @FindBy(css = ".visible-lg .cognito-asf .redirect-customizable:nth-child(7)")
    public WebElement forgotPasswordButton;

    @FindBy(css = ".mat-elevation-z3 > div:nth-of-type(3)")
    public WebElement settingsBtn;


    public void inputUserName(String firstName) {
        userNameField.sendKeys(firstName);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignInBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
        signInBtn.click();


    }

    public void login(String firstName, String password) {
        userNameField.sendKeys(firstName);
        passwordField.sendKeys(password);
        signInBtn.click();
    }

    public ProfilePage openUserProfile(String  a,String b) {
        login(a,b);
        return new ProfilePage((driver));

    }
}