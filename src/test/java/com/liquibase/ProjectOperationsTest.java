package com.liquibase;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProjectOperationsTest extends BaseTest{
    protected WebDriver driver;
    private HomePage homePage;
    private ProfilePage profilePage;
    private ProjectOperationsPage projectOperationsPage ;
    private LoginPage loginPage;
    private UserPage userPage;




    @Test
    void login() {
        homePage = new HomePage(driver);
        loginPage = homePage.openLoginPage();

        loginPage.inputUserName(userPage.getFirstName());
        loginPage.inputPassword(userPage.getPassword());
        loginPage.clickSignInBtn();
        projectOperationsPage.selectOperationsFromDropDownMenu();
    }


}