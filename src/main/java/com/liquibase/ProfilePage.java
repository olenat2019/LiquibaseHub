package com.liquibase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "div:nth-of-type(1) > .settings-tree__item__route > .settings-tree__item__route__name")
    public WebElement userInfoBtn;


    @FindBy(css = ".mat-form-field-infix.ng-tns-c58-19")
    public WebElement firstNameField;

    @FindBy(css = ".mat-form-field-infix.ng-tns-c58-20")
    public WebElement middleNameField;

    @FindBy(xpath = "//mat-form-field[3]//div[@safeclass~'\\bmat-form-field-infix\\b']")
    public WebElement lastNameField;

    @FindBy(css = ".cdk-text-field-autofill-monitored.mat-form-field-autofill-control.mat-input-element.ng-pristine.ng-tns-c58-24.ng-touched.ng-valid")
    public WebElement urlField;

    @FindBy(css = ".cdk-text-field-autofill-monitored.mat-form-field-autofill-control.mat-input-element.ng-pristine.ng-tns-c58-25.ng-touched.ng-valid")
    public WebElement companyField;

    @FindBy(css = ".cdk-text-field-autofill-monitored.mat-form-field-autofill-control.mat-input-element.ng-pristine.ng-tns-c58-26.ng-touched.ng-valid")
    public WebElement bioField;

    @FindBy(xpath = "//span[@innertext='Update Profile']")
    public WebElement updateProfileButton;

    @FindBy(xpath = "//span[@innertext='Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(css = ".mat-button-base.mat-raised-button.mat-warn > .mat-button-wrapper")
    public WebElement deleteItButton;

    public void clickUserInfoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(userInfoBtn));
        userInfoBtn.click();

    }

    public void updateFirstname(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);

    }

    public void updateMiddleNameField(String middleName) {
        middleNameField.clear();
        middleNameField.sendKeys(middleName);

    }

    public void updateLastNameField(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void updateUrlField(String url) {
        urlField.clear();
        urlField.sendKeys(url);
    }

    public void updateCompanyField(String company) {
        companyField.clear();
        companyField.sendKeys(company);
    }
    public void updateTextField(String text) {
        bioField.clear();
        bioField.sendKeys();

    }

    public String clickUpdateProfileButton() {
        wait.until(ExpectedConditions.elementToBeClickable(updateProfileButton));
        updateProfileButton.click();
        String result = updateProfileButton.getText();
        return result;

    }
    public void deleteAccount(){
        deleteAccountButton.click();
        deleteItButton.click();

    }

    public String getFirstNameField() {
        String res = firstNameField.getAttribute("value");
        return res;
    }

    public String getMiddleNameField() {
        String res = middleNameField.getAttribute("value");
        return res;
    }

    public String getLastNameField() {
        String res = lastNameField.getAttribute("value");
        return res;
    }

    public String getUrlField() {
        String res = urlField.getAttribute("value");
        return res;
    }

    public String getCompanyField() {
        String res = companyField.getAttribute("value");
        return res;
    }

    public String getBioField() {
        String res = bioField.getAttribute("value");
        return res;
    }

}