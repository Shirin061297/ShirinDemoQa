import com.beust.ah.A;
import com.demoqa.pages.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBoxTest  extends BaseTest {

  @BeforeClass
    @Test
    public void textBoxTest() {
        driver.get("https://demoqa.com/text-box");
       checkBoxPage.clickCheckBox();

    }

    @Test
    void txt() {
        //   Получаем текст элемента
        String actualText = checkBoxPage.txt.getText();

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

        // Проверяем, что текст совпадает с ожидаемым
        Assert.assertEquals(actualText, expectedText, "не схожие");
    }
    @Test
        void test() {
       checkBoxPage.desktopGal();
        String actualTxtDesk = checkBoxPage.desktopGal.getText();
        String expectedTxt = "You have selected :\n" +
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
        Assert.assertEquals( expectedTxt, actualTxtDesk,"не схожие");
    }

//    @Test
//void docTxt(){
//      demoQAPages.getCheckBoxPage().documentGal();
//        String actualTxtDocument = demoQAPages.getCheckBoxPage().desktopGal.getText();
//        String exceptedTxt = "desktop\n" +
//                "notes\n" +
//                "commands\n" +
//                "downloads\n" +
//                "wordFile\n" +
//                "excelFile";
//        Assert.assertEquals(exceptedTxt,actualTxtDocument,"не схожие");
//     }

}
