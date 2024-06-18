import com.demoqa.draivers.DriverManager;
import org.testng.annotations.Test;

public class MenuTest extends  BaseTest {


    @Test(description = "Verify move to element wethods is working")
    public void moveToElementTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/menu");
        webElementActions.moveToElement(menuPage.mainItem2);
        Thread.sleep(5000);

    }
}
