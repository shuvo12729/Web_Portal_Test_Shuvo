

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class UniPortalTesting {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void setupChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }


    @Test
    public void portalsTesting() {
        driver.get("http://159.89.38.11/login");
    }

    @Test
    public void UserLogin() throws InterruptedException {
        driver.get("http://159.89.38.11/login");
        //wait = new WebDriverWait(driver,Duration.ofSeconds(120));
        driver.findElement(By.id("email-1")).sendKeys("test@orangetoolz.com");
        driver.findElement(By.id("password-1")).sendKeys("8Kh8nTe*^jdk");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='m_login_signin_submit']")).click();
        Thread.sleep(6000);



        driver.get("http://159.89.38.11/profile");
        //wait = new WebDriverWait(driver,Duration.ofSeconds(120));
        driver.findElement(By.name("first_name")).sendKeys("Shaharier");
        driver.findElement(By.name("last_name")).sendKeys("Shuvo");
        driver.findElement(By.name("phone")).sendKeys("12345678910");
        driver.findElement(By.name("address")).sendKeys("1216");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(6000);


    }



    @Test
    public void SelectProduct() {
        driver.get("http://159.89.38.11/login");
        //driver.findElement(By.name("Details")).click();

       // String text1 = driver.findElement(By.id("doubleClickMessage")).getText();
        //String text2 = driver.findElement(By.id("rightClickMessage")).getText();

        //driver.findElement(By.xpath("//button[@id='submit']")).click();
    }






    @AfterEach
    public void finishTest() {
        driver.close();
    }

}