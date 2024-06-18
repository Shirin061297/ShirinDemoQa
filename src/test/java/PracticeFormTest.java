import com.demoqa.entites.PracticFormEntity;
import com.demoqa.pages.PracticeFormPage;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    @Test
    public void practiceFormTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");

        practiceFormPage.selectDateMonthYear("30 Jun 2020");


        //LocalDate
        //

//        PracticFormEntity practicFormEntity = randomUtils.generateRandomPracticeFormEntity();
//       // practiceFormPage.selectGender(practicFormEntity.getGender());
     // practiceFormPage.fillPracticeForm();





    }
}
