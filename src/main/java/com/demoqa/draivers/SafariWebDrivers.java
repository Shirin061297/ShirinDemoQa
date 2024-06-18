package com.demoqa.draivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class SafariWebDrivers {

    public static WebDriver loadSafariDriver(){
        System.setProperty("webdriver.safari.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
