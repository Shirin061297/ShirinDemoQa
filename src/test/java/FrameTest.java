import com.demoqa.pages.Alert.enums.Endpoints;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameTest extends  BaseTest{

    @Test(description = "Verify  that driver can switch to another frame  ")
    public void  doubleClickTest() {
        browserHelper.open(ConfigReader.getValue("baseDevURL")+ Endpoints.FRAMES.getEndpoint());
        iframeHelper.switchToFrame("frame1"); //switchToFrame переключение
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());

    }
}
