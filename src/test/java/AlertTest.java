import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

import static com.demoqa.pages.Alert.enums.Endpoints.ALERT;

public class AlertTest  extends BaseTest{

    @Test(groups = {"E2E_Test","1721"},description = "Allert test")
    void alertTest(){
       browserHelper.open(ConfigReader.getValue("baseDevURL")+ ALERT.getEndpoint());
        webElementActions.click(alertPage.confirmAlertBtn);
        alertHelper.acceptAlert();
        webElementActions.pause(5000);


    }

//    @Test(groups = {"Regression","API","1721"},description = "Allert test 1")
//    void alertTest1(){
//        driver.get("https://demoqa.com/alerts");
//        webElementActions.click(alertPage.confirmAlertBtn);
//        alertHelper.acceptAlert();
//
//
//    }
//    @Test(groups = {"E2E","SQL","1721"},description = "Allert test 2")
//    void alertTest2(){
//        driver.get("https://demoqa.com/alerts");
//        webElementActions.click(alertPage.confirmAlertBtn);
//        alertHelper.acceptAlert();
//
//
//    }
}
