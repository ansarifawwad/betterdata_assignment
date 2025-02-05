package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainClass {

    String url = "https://www.google.co.uk/";
    public static WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public void main() {

        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @AfterSuite
    public void tearDown(){
    driver.quit();
    }

}
