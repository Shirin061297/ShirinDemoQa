package demo.elements.samolet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class StreamApi {
        WebDriver driver;

        @Test
        void findByIdTest() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().window().maximize();

            driver.get("https://dostavka312.kg/category/11");
            List<WebElement> kafeList = driver.findElements(By.xpath("//div[@class='panel-heading']"));

            kafeList.forEach(kafe -> System.out.println(kafe.getText() + "\n======================================================"));

            kafeList.stream()
                    .filter(kafe -> kafe.getText().equals("Ресторан Пишпек\nТоголока Молдо, 17/1а"))
                    .findFirst()
                    .ifPresent(kafe -> {
                        WebElement menu = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek']"));
                        menu.click();

                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[1]", "ЗАВТРАКИ");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[2]", "ХОЛОДНЫЕ ЗАКАЗЫ");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[3]", "САЛАТЫ");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[4]", "СУП");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[5]", "ВОСТОЧНАЯ КУХНЯ");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[6]", "КРЕМ СУП");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[7]", "ВОСТОЧНЫЙ СУП");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[8]", "ГОРЯЧИЕ ЗАКУСКИ");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[9]", "ВЫПЕЧКА");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[10]", "ПАСТА");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[11]", "СТЕЙК");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[12]", "ГОРЯЧИЕ БЛЮДА ЕВРОПЕЙСКОЙ КУХНИ");
                        printSection(driver, "//*[@id=\"WWMainPage\"]/div[13]",  "БЛЮДА ИЗ РЫБЫ");
                    });

            driver.quit();
        }

        private void printSection(WebDriver driver, String xpath, String sectionName) {
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            elements.forEach(element -> System.out.println(sectionName + "\n" + element.getText() + "\n---------------------------------------"));
        }


}
