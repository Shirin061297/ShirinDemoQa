package com.demoqa.pages;

import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;
import static com.demoqa.draivers.DriverManager.getDriver;

public class ProgressBarPage extends BasePage {

    @FindBy(id = "startStopButton")
    public WebElement startStopButton;

    @FindBy(xpath = "//div[@aria-valuenow]")
    public WebElement aria_Valuenow;

    public ProgressBarPage startStopProgressBar(String valuenow ) throws InterruptedException {

        webElementActions.click(startStopButton);
        while (true) {
            valuenow = aria_Valuenow.getAttribute("aria-valuenow");
             int a = Integer.parseInt(valuenow);
                if (a >= 52) {
                    webElementActions.click(startStopButton);
                    System.out.println("Прогресс-бар остановлен на значении: " + a);
                    break;
                }

            Thread.sleep(5);
        }return this;


    }







}
