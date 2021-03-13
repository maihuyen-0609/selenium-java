package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public static void validCredentials() {

//step1:
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    //step2:
    driver.get("http://the-internet.herokuapp.com/login");
    //step3:  Fill in username with tomsmith
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    //step4: Fill in the password with SuperSecretPassword!
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    //step5: Click on Login button
    driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
    //step6: And the home page is appear
    String currentUrl = driver.getCurrentUrl();
    Assert.assertTrue(currentUrl.contains("/secure"));




    }


}
