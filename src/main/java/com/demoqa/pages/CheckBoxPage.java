package com.demoqa.pages;

import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckBoxPage extends BasePage {

    @FindBy(id = "item-1")
    public WebElement checkBox;




    @FindBy(xpath = "//span[@class='rct-checkbox']")
    public WebElement home;

    @FindBy(id = "result")
    public WebElement txt;


    @FindBy(xpath = "//button[@title='Toggle']")
    public WebElement button;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")//СВЕРНУТЬ DESKTOP
    public WebElement desktopbutton;


    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")//СВЕРНУТЬ DOCUMENT
    public WebElement document;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button")//СВЕРНУТЬ WORKSPACE
    public WebElement workSpace;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button")//СВЕРНУТЬ OFFICE
    public WebElement office;

    @FindBy(xpath = "svg.rct-icon-expand-close")  //СВЕРНУТЬ DOWNLOAD
    public WebElement downloads;








//    @FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[1]")
//    public WebElement desktopButton;

//desktop bez galochek
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]")
    public WebElement desktopGal;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]")
    public WebElement documentGal;




    @FindBy(xpath = "//span[@class='rct-checkbox']")
    public WebElement home1;


    public CheckBoxPage clickCheckBox(){
        webElementActions.click(checkBox);
        webElementActions.click(home);
        webElementActions.click(button);
        webElementActions.click(desktopbutton);
        webElementActions.click(document);
        webElementActions.click(workSpace);
        webElementActions.click(office);
        //webElementActions.click(desktopGal);
      //  webElementActions.click(documentGal);

        String actualText = txt.getText();




//        checkBoxPage.documentGal();
//        String actualTxtDocument = checkBoxPage.desktopGal.getText();
//        String exceptedTxt = "You have selected :\n" +
//                "downloads\n" +
//                "wordFile\n" +
//                "excelFile";
//        Assert.assertEquals(actualTxtDocument,exceptedTxt,"не схожие");
//    }


        return this;
    }

    // Метод для клика по чекбоксу "Home"
//    public CheckBoxPage clickHomeCheckBox() {
//       webElementActions.click(home);
////       webElementActions.click(button);
////       webElementActions.click(desktop);
////       webElementActions.click(desktopButton);
////       webElementActions.click(checkNotes);
////       webElementActions.click(checkCommand);
////       webElementActions.click(document);
////       webElementActions.click(buttonWorkSpaceDoc);
////       webElementActions.click(button);
////       webElementActions.click(buttonOffice);
////       webElementActions.click(downloads);
////       webElementActions.click(wordFileDok);
////       webElementActions.click(ExcelFiledoc);
//        return this;
//    }


//    public CheckBoxPage clickButton(){
//        webElementActions.click(button);
//
//        return this;
//    }
//    public CheckBoxPage clickDesktop(){
//        webElementActions.click(desktopButton);
//        return this;
//    }

   public CheckBoxPage desktopGal(){
       webElementActions.click(desktopGal);
       return this;
  }
//
    public CheckBoxPage documentGal(){
        webElementActions.click(documentGal);
        return this;
    }



    public CheckBoxPage  home1(){
        webElementActions.click(home1);
        return this;
    }




















}
