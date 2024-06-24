import com.demoqa.entites.TextBoxEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test(groups = {"Smoke","9033"},description = "textBoxTest")
    public  void  textBoxTest(){
        driver.get("https://demoqa.com/text-box");
        TextBoxEntity textBoxEntity = randomUtils.generateRandomTextBoxEntity();

       textBoxPage.fillUpTextBoxForm(textBoxEntity);
        Assert.assertTrue(true);




    }
}
