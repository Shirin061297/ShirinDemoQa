import com.demoqa.draivers.DriverManager;
import com.demoqa.helper.AlertHelper;
import com.demoqa.helper.BrowserHelper;
import com.demoqa.helper.IframeHelper;
import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.*;
import com.demoqa.pages.Alert.AlertPage;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {



    protected WebDriver driver;
    protected RandomUtils randomUtils;
    protected WebElementActions webElementActions;
    protected AlertHelper alertHelper;
   // protected DemoQAPages demoQAPages;
    protected BrowserHelper browserHelper;

    protected CheckBoxPage checkBoxPage;
    protected TextBoxPage textBoxPage;
   // protected RandomUtils randomUtils;
    protected AlertPage alertPage;
    protected PracticeFormPage practiceFormPage;

    protected ButtonsPage buttonsPage;
    protected MenuPage menuPage;
    protected ProgressBarPage progressBarPage;
    protected WebTablePage webTablePage;

    protected IframeHelper iframeHelper;




    @BeforeClass(alwaysRun = true)
    public  void setUp(){
        driver = DriverManager.getDriver();
        randomUtils = new RandomUtils();
        webElementActions = new WebElementActions();
        alertHelper = new AlertHelper(driver);
        browserHelper = new BrowserHelper(driver);
       // demoQAPages = new DemoQAPages();
        checkBoxPage = new CheckBoxPage();
        textBoxPage = new TextBoxPage();
        alertPage = new AlertPage();
        practiceFormPage = new PracticeFormPage();
        buttonsPage = new ButtonsPage();
        menuPage = new MenuPage();
        progressBarPage = new ProgressBarPage();
        webTablePage = new WebTablePage();
        iframeHelper = new IframeHelper(driver);


    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        DriverManager.closeDriver();
    }


}
