import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHalperTest extends BaseTest {

    @Test(groups = {"E2E_Test","2356"}, description = "tes123")
    void test123() throws InterruptedException {
        browserHelper.open("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        browserHelper.switchToWindow(0);
        //ЗАКРЫВАЕТ И ПЕРЕХОДИТ НА РОДИТЕЛЯ 0-Индекс
        browserHelper.switchToParentWithChildClose();





       // driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        //Thread.sleep(2000);
//        browserHelper.goBack();
//        Thread.sleep(2000);
//        browserHelper.goForward();
//        Thread.sleep(2000);
//        browserHelper.refreshThePage();




       // driver.findElement(By.id("tabButton")).click();

    }
}
