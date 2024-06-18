package demo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.TreeMap;

public class TextBox {
String name;


        @Test
        void textBoxTest() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/text-box");

            name = "Shirin";
            String email = "Shirin.061297@gmail.com";
            String currAdd = "Russia Krasnoyarsk 1/5";
            String perAdd = "Russia Krasnoyarsk 1/5";

            WebElement fullNameInput = driver.findElement(By.id("userName"));
            fullNameInput.sendKeys(name);

            WebElement emailInput = driver.findElement(By.id("userEmail"));
            emailInput.sendKeys(email);

            WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
            currentAddressInput.sendKeys(currAdd);

            WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
            permanentAddressInput.sendKeys(perAdd);

            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
            submitButton.click();

            // Wait for the results to be displayed
            Thread.sleep(2000);

            String submitNameText = driver.findElement(By.id("name")).getText();
            String submitEmailText = driver.findElement(By.id("email")).getText();
            String submitCurAddText = driver.findElement(By.xpath("//*[@id='output']//p[@id='currentAddress']")).getText();
            String submitPerAddText = driver.findElement(By.xpath("//*[@id='output']//p[@id='permanentAddress']")).getText();

            // Clean up the extracted text
            submitNameText = submitNameText.replace("Name:", "").trim();
            submitEmailText = submitEmailText.replace("Email:", "").trim();
            submitCurAddText = submitCurAddText.replace("Current Address :", "").trim();
            submitPerAddText = submitPerAddText.replace("Permananet Address :", "").trim();

            // Assertions
            Assert.assertEquals(submitNameText, name);
            Assert.assertEquals(submitEmailText, email);
            Assert.assertEquals(submitCurAddText, currAdd);
            Assert.assertEquals(submitPerAddText, perAdd);

            driver.quit();
        }

    
    }
