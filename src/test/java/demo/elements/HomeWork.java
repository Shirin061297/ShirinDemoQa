package demo.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork {

   private WebDriver driver;

@BeforeMethod
void test(){
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/text-box");
}

    @Test
    void textBoxTest() throws InterruptedException {
        WebElement checkBox = driver.findElement(By.id("item-1"));
        checkBox.click();
        WebElement home = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        home.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement updatedElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("result")));
        // Получаем текст элемента после клика
        String updatedText = updatedElement.getText();
        // Ожидаемый текст
        String expectedText = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(  updatedText , expectedText,"не схожие");

        WebElement down = driver.findElement(By.xpath("//label[@for='tree-node-desktop']"));
        down.click();
}

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
