package org.example.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataWarehouse {

    WebDriver driver;
    public DataWarehouse(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;

    @FindBy(xpath = "//p[normalize-space()='Data Warehouse']")
    public WebElement navToDataWarehouse;

    @FindBy(xpath = "//button[normalize-space()='Add data source']")
    public WebElement addNewSourceButton;

    @FindBy(xpath = "//label[@for='own']//span[@type='radio']")
    public WebElement readyToUpload;

    @FindBy(xpath = "//input[@accept='.csv']")
    public WebElement upload;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement next;

    @FindBy(xpath = "//textarea[@id='field-:r2u:']")
    public WebElement description;

    @FindBy(id = "//button[@type='submit']")
    public WebElement addNewDataSource;

    @FindBy(id = "//button[normalize-space()='Close']")
    public WebElement cancel;

    @FindBy(xpath = "//button[@aria-label='Expand row']//*[name()='svg']//*[name()='path' and contains(@d,'M9 6l6 6l-')]")
    public WebElement expandForDescription;

    @FindBy(xpath = "//button[normalize-space()='Data profile']")
    public WebElement dataProfile;

    @FindBy(xpath="//button[@aria-label='Close']")
    public WebElement cancelSidebar;

    @FindBy(xpath = "//button[@id='menu-button-:rh:']//*[name()='svg']")
    public WebElement moreOptions;

    @FindBy(xpath = "//button[@id='menu-list-:rh:-menuitem-:rj:']")
    public WebElement delete;
}
