package com.demoqa.pages;

import com.demoqa.draivers.DriverManager;
import com.demoqa.entites.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



import static com.demoqa.draivers.DriverManager.getDriver;

public class WebTablePage extends  BasePage {
    @FindBy(id = "addNewRecordButton")
    public WebElement addNewBtn;

    @FindBy(id = "firstName")
    public WebElement firstnameInput;

    @FindBy(id = "lastName")
    public WebElement lastnameInput;

    @FindBy(id = "age")
    public WebElement ageInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "salary")
    public WebElement salaryInput;

    @FindBy(id = "department")
    public WebElement departmentInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(id = "edit-record-5")
    public WebElement edited;

    @FindBy(id = "userEmail")
    public WebElement emailInput2;

    @FindBy(id = "delete-record-1")
    public  WebElement kiera1;

    @FindBy(id = "edit-record-3")
    public  WebElement edit3;

    private final String emailShirin = "Shirin@mail.com";

    public WebTablePage addNewEmployee(Employee employee) {
        webElementActions.click(addNewBtn)
                .sendKeys(firstnameInput, employee.getFirstName())
                .sendKeys(lastnameInput, employee.getLastName())
                .sendKeys(ageInput, String.valueOf(employee.getAge()))
                .sendKeys(emailInput, emailShirin)
                .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
                .sendKeys(departmentInput, employee.getDepartment())
                .click(submitBtn);
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        ArrayList<String> email = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String emailSpisok = cells.get(3).getText();
            email.add(emailSpisok);

            boolean hasDuplicates = email.stream().distinct().count() != email.size();
            if (hasDuplicates) {
                try {
                    throw new Exception("Есть дубликат ");
                } catch (Exception e) {
                    System.err.println("Поменяйте свою почту  " + emailShirin);
                }
            } else {
                System.out.println("В списке нет дубликатов адресов электронной почты.");
            }


//            webElementActions.click(addNewBtn)
//                    .sendKeys(firstnameInput, employee.getFirstName())
//                    .sendKeys(lastnameInput, employee.getLastName())
//                    .sendKeys(ageInput, String.valueOf(employee.getAge()))
//                    .sendKeys(emailInput, emailShirin)
//                    .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
//                    .sendKeys(departmentInput, employee.getDepartment())
//                    .click(submitBtn);
        }
        return this;
    }

    public ArrayList<Employee> getEmployeesFromTable(Employee employee) {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));

        ArrayList<Employee> employees = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String firstName = cells.get(0).getText();
            String lastName = cells.get(1).getText();
            String ageText = cells.get(2).getText().replaceAll("[^0-9]", "");
            String email = cells.get(3).getText();
            String salaryText = cells.get(4).getText().replaceAll("[^0-9]", "");
            String department = cells.get(5).getText();
            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty()
                    || salaryText.isEmpty() || department.isEmpty()) {
                continue;
            }

            int age = Integer.parseInt(ageText.trim());
            long salary = Long.parseLong(salaryText.trim());

            if (cells.size() > 3){
                webElementActions.click(edit3);

                firstInput.clear();
                webElementActions.sendKeys(firstInput , employee.getFirstName());
                lastInput.clear();
                webElementActions.sendKeys(lastnameInput , employee.getLastName());
                emailInput.clear();
                webElementActions.sendKeys(emailInput , employee.getEmail());
                ageInput.clear();
                webElementActions.sendKeys(ageInput , String.valueOf(employee.getAge()));
                salaryInput.clear();
                webElementActions.sendKeys(salaryInput , String.valueOf(employee.getSalary()));
                departmentInput.clear();
                webElementActions.sendKeys(departmentInput , employee.getDepartment())
                        .click(submitBtn);

            }

            employees.add(new Employee(firstName, lastName, age, email, salary, department));

        }
        return employees;
    }

//    public ArrayList<String> getEmployeesFromTable1() {
//        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
//        ArrayList<String> email = new ArrayList<>();
//
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
//            String emailSpisok = cells.get(3).getText();
//            email.add(emailSpisok);
//        }
//        boolean hasDuplicates = email.stream().distinct().count() != email.size();
//        if (hasDuplicates) {
//            try {
//                throw new Exception("Есть дубликат ");
//            }catch (Exception e ){
//                System.err.println("Поменяйте свою почту  " + emailShirin);
//            }
//        } else {
//            System.out.println("В списке нет дубликатов адресов электронной почты.");
//        }
//        return email;}

    public WebTablePage shirin(Employee employee) {
        webElementActions.click(edited);
        emailInput2.clear();
        webElementActions.sendKeys(emailInput2, employee.getEmail())
                .click(submitBtn);

        return this;
    }

    public WebTablePage clear() {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        for (WebElement ciera : rows) {
            List<WebElement> employee = ciera.findElements(By.cssSelector(".rt-td"));
            String emailDelet = employee.get(3).getText();
            if (emailDelet.contains("cierra@example.com")) {
                webElementActions.click(kiera1);
                break;
            } else {
                System.out.println("net");
            }
        }
        return this;
    }












    @FindBy(id = "firstName")
    public WebElement firstInput;

    @FindBy(id = "lastName")
    public WebElement lastInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput1;

    @FindBy(id = "age")
    public WebElement ageInput1;

    @FindBy(id = "salary")
    public WebElement salaryInput1;

    @FindBy(id = "department")
    public WebElement departmentInput1;

    @FindBy(id = "edit-record-2")
    public WebElement edit;

    @FindBy(id = "submit")
    public WebElement submit;

    public  WebTablePage change(Employee employee){
        webElementActions.click(edit);
        firstInput.clear();
        webElementActions.sendKeys(firstnameInput, employee.getFirstName());
        lastInput.clear();
        webElementActions.sendKeys(lastnameInput, employee.getLastName());
        emailInput1.clear();
        webElementActions.sendKeys(emailInput1, employee.getEmail());
        ageInput1.clear();
        webElementActions.sendKeys(ageInput1, String.valueOf(employee.getAge()));
        salaryInput1.clear();
        webElementActions.sendKeys(salaryInput1, String.valueOf(employee.getSalary()));
        departmentInput1.clear();
        webElementActions.sendKeys(departmentInput, employee.getDepartment());
        webElementActions.click(submit);
        return  this;

    }


//    public WebElement employ(){
//
//    }






}



