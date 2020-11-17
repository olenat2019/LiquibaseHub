package com.liquibase;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginValidDataTest extends BaseTest {
    private LoginPage loginPage;
    private HomePage homePage;
    protected WebDriverWait driverWait;


    @Test
    public void testLogin() {
        homePage = new HomePage(driver);
        loginPage = homePage.openLoginPage();

        loginPage.inputUserName(user.getFirstName());
        loginPage.inputPassword(user.getPassword());
        loginPage.clickSignInBtn();


    }

}
