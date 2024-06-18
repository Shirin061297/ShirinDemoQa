import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends  BaseTest{

    @Test(description = "")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");
       progressBarPage.startStopProgressBar("aria-valuenow");


    }
}
