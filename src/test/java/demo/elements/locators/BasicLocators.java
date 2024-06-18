package demo.elements.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicLocators {

    WebDriver driver;

    @Test
    void findByIdTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://nambafood.kg/");
        WebElement link = driver.findElement(By.linkText("Еда"));
        link.click();
        driver.get("https://nambafood.kg/cafe/national");
        WebElement txt = driver.findElement(By.linkText("Национальная"));
        txt.click();
        //driver.get("https://nambafood.kg/alligator");
        WebElement alligator = driver.findElement(By.xpath("//div[normalize-space(text()) = 'Кафе Alligator Green']"));
        alligator.click();
        WebElement salat = driver.findElement(By.xpath("//*[@id=\"14\"]/div/div[1]/div[2]/button"));
        salat.click();
        WebElement salaB = driver.findElement(By.xpath("//*[@id=\"14\"]/div/div[2]/div[2]/button"));
        salaB.click();
        WebElement kar = driver.findElement(By.xpath("//*[@id=\"cart\"]/a"));
        kar.click();
        WebElement zakaz = driver.findElement(By.xpath("/html/body/main/section/div[1]/div[5]/div[11]/a/button"));
        zakaz.click();

        WebElement fullName = driver.findElement(By.id("food_order_client_name"));
        fullName.clear();
        fullName.sendKeys("Замирбек");

        WebElement address = driver.findElement(By.id("food_order_address"));
        address.clear();
        address.sendKeys("Белорусская 2/3  , кв 85");


    }

//    @Test
//    void national() throws InterruptedException {
//        WebElement alligator = driver.findElement(By.xpath("//div[normalize-space(text()) = 'Кафе Alligator Green']"));
//        alligator.click();
//        Thread.sleep(5000);
//
//
//    }

//    @Test
//    void zira(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.manage().window().maximize();

//        driver.get("https://nambafood.kg/cafe/zira");
//        WebElement zira = driver.findElement(By.linkText("Zira"));
//        zira.click();
//    }
}
