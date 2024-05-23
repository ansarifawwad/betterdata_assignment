package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainClass {

    String url = "http://af8d2bdc267e54e139a6ccc817f0a8f6-1149838503.ap-southeast-1.elb.amazonaws.com:8080/betterdata/signin";
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
