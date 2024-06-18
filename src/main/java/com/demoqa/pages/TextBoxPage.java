package com.demoqa.pages;

import com.demoqa.draivers.DriverManager;
import com.demoqa.entites.TextBoxEntity;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends  BasePage{
    //только те web элементы которые будут принадлежать этому классу (специальный класс)


//    public TextBoxPage() { // конструктор без этого , анатации не будут работать
//        PageFactory.initElements(DriverManager.getDriver(), TextBoxPage.class);
//    }


    //(патарное ПО) чтобы найти элемент используем анатацию @FindBy(можем любое xPas , css )
    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;


    @FindBy(id = "submit")
    public WebElement submitBtn; //Btn baton


    public TextBoxPage fillUpTextBoxForm(String fullName , String email , String currentAddress,String permanentAddress){
     webElementActions.sendKeys(fullNameInput, fullName)
             .sendKeys(emailInput,email)
             .sendKeys(currentAddressInput,currentAddress)
             .sendKeys(permanentAddressInput,permanentAddress)
             .jsClick(submitBtn);
     return this;

    }
     //здесь для параметра создали специальный класс (TextBoxEntity) вызвали приватные методы
    public TextBoxPage fillUpTextBoxForm(TextBoxEntity textBoxEntity){
        webElementActions.sendKeys(fullNameInput,textBoxEntity.getFullName())
                .jsSendKeys(emailInput,textBoxEntity.getEmail())
                .jsSendKeys(currentAddressInput,textBoxEntity.getCurrentAddress())
                .jsSendKeys(permanentAddressInput,textBoxEntity.getPermanentAddress())
                .click(submitBtn);
        return  this;
    }





}