package com.demoqa.pages.Alert;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {
    @FindBy(id = "confirmButton")
    public WebElement confirmAlertBtn;


}
