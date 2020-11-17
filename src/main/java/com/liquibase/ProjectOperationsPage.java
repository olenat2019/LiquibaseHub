package com.liquibase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ProjectOperationsPage extends BasePage {


    public ProjectOperationsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".mat-elevation-z3.sidenav__context > div:nth-of-type(2)")
    public WebElement projectButton;

    @FindBy(css = ".projects-tree__item__label__text")
    public WebElement projectNameDropDownMenu;

    @FindBy(xpath = "///div[@innertext='Operations']")
    public WebElement operationsButton;

    @FindBy(css = ".mat-select-value.ng-tns-c114-28")
    public WebElement resultField;

    @FindBy(xpath = "//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']/span[2]")
    public WebElement noOperationsToDisplayDropDown;

    public void clickProjectButton(){
        wait.until(ExpectedConditions.elementToBeClickable(projectButton));
        projectButton.click();
    }

    public void clickProjectNameDropDownMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(projectNameDropDownMenu));
        projectNameDropDownMenu.click();
    }
    public void selectOperationsFromDropDownMenu(){
        operationsButton.click();
        Select dropdown = new Select(driver.findElement(By.cssSelector(".mat-select-value.ng-tns-c114-48")));
        dropdown.selectByVisibleText("Pass");

    }



        }
    

