package com.liquibase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateProfileInfoTest extends BaseTest {

    protected WebDriver driver;
    private HomePage homePage;
    private ProfilePage profilePage;


    @Test (priority = 1)
    void login(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.openLoginPage();
        //loginPage.login(user.getFirstName(), user.getPassword());
        profilePage = loginPage.openUserProfile(user.getFirstName(), user.getPassword());

    }

    @Test(priority = 2)
    void updateUserInfoTest(){
        profilePage.clickUserInfoButton();
        profilePage.updateFirstname(user.getFirstName());
        profilePage.updateLastNameField(user.getLastName());
        profilePage.updateUrlField(user.getUrl());
        profilePage.updateCompanyField(user.getCompany());
        profilePage.updateTextField(user.getText());
        profilePage.clickUpdateProfileButton();
        profilePage.deleteAccount();

        String firstName = profilePage.getFirstNameField();
        Assert.assertEquals(user.getPassword(), firstName);

        String lastName = profilePage.getLastNameField();
        Assert.assertEquals(user.getFirstName(), lastName);

        String middleName = profilePage.getMiddleNameField();
        Assert.assertEquals(user.getMiddleName(), middleName);

        String url = profilePage.getUrlField();
        Assert.assertEquals(user.getLastName(), url);

        String company = profilePage.getCompanyField();
        Assert.assertEquals(user.getLastName(), company);

        String bio = profilePage.getBioField();
        Assert.assertEquals(user.getLastName(), bio);

    }



   }

