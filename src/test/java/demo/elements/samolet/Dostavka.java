package demo.elements.samolet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public  class Dostavka {

    WebDriver driver;

    @Test
    void findByIdTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().window().maximize();

        driver.get("https://dostavka312.kg/category/11");
       List<WebElement> сafeList = driver.findElements(By.xpath("//div[@class='panel-heading']"));


        for (WebElement сafe : сafeList) {
            System.out.println(сafe.getText() + "\n======================================================");
            //Thread.sleep(9000);
        }

        for (WebElement сafeList1 : сafeList){
            if (сafeList1.getText().equals("Ресторан Пишпек\n" +
                    "Тоголока Молдо, 17/1а")) {

                WebElement submitButton = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek']"));
               // driver.get("https://dostavka312.kg/garnirygpt/restoran-pishpek");
                submitButton.click();
                List<WebElement> zavtraki = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[1]"));
                for (WebElement zav : zavtraki) {
                    System.out.println("ЗАВТРАКИ\n"+zav.getText() + "\n ---------------------------------------");
                }

                List<WebElement> holodnyeZakuski = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[2]"));
                for (WebElement holZavt : holodnyeZakuski) {
                    System.out.println("ХОЛОДНЫЕ ЗАКАЗЫ\n"+holZavt.getText() + "\n ---------------------------------------");
                }

                List<WebElement> sup = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[4]"));
                for (WebElement sup1 : sup) {
                    System.out.println("СУП\n"+sup1.getText() + "\n ---------------------------------------");
                }

                List<WebElement> vostokKuhnya = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[5]"));
                for (WebElement vostok : vostokKuhnya) {
                    System.out.println("ВОСТОЧНАЯ КУХНЯ\n"+vostok.getText() + "\n ---------------------------------------");
                }

                List<WebElement> kremSup = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[6]"));
                for (WebElement krSup : kremSup) {
                    System.out.println("КРЕМ СУП \n" + krSup.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> vostSup = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[7]"));
                for (WebElement vostochnyiSup : vostSup) {
                    System.out.println("ВОСТОЧНЫЙ СУП \n" + vostochnyiSup.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> goryachieSakuski = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[8]"));
                for (WebElement gorZakus : goryachieSakuski) {
                    System.out.println("ГОРЯЧИЕ ЗАКУСКИ \n" + gorZakus.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> vypechka = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[9]"));
                for (WebElement vypechka1 : vypechka) {
                    System.out.println("ВЫПЕЧКА \n" + vypechka1.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> pasta = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[10]"));
                for (WebElement pasta1 : pasta) {
                    System.out.println("ПАСТА \n" + pasta1.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> stake = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[11]"));
                for (WebElement stake1 : stake) {
                    System.out.println("СТЕЙК \n" + stake1.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> evropKuhnya = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[12]"));
                for (WebElement evropKuhnya1 : evropKuhnya) {
                    System.out.println("ГЩРЯЧИЕ БЛЮДА ЕВРОПЕЙСКОЙ КУХНИ \n" + evropKuhnya1.getText() + "\n ---------------------------------------\"");
                }
                driver.quit();
            }}
        }
    }






//div[@class='panel-body text-left']/div div[@class='art-postcontent clearfix']/div
