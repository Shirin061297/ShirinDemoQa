import com.demoqa.entites.Employee;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends BaseTest{

    @Test(groups = {"Smoke","8036"},description = "practice form test")
    public  void tes123(){
        driver.get("https://demoqa.com/webtables");
        Employee employe = randomUtils.creatMocEmployee();

        webTablePage.addNewEmployee(randomUtils.creatMocEmployee());
        webTablePage.addNewEmployee(randomUtils.creatMocEmployee());
        List<Employee> employees = webTablePage.getEmployeesFromTable(randomUtils.creatMocEmployee());

        for(Employee employee: employees ){
            System.out.println(employee);
        }
       // webTablePage.getEmployeesFromTable1();
       // webTablePage.clear();
       // webTablePage.shirin(randomUtils.creatMocEmployee());
       //webTablePage.change(randomUtils.creatMocEmployee());




    }
}
