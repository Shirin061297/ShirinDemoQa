package com.demoqa.draivers;

import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.beans.ConstructorProperties;

public class DriverManager {

    private static WebDriver driver;  //не инициализируем просто пишем driver , пока пусто


    //управляем драйвером (потом будем вызывать)
    public static  WebDriver getDriver(){
        if (driver==null){
            //вызвали в пакете utils ConfigReader.getValue приорити
            switch (ConfigReader.getValue("browser").toLowerCase()){
                case "chrome":
                    //вызвали наш класс где есть  обьект chrome
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver=FirefoxWebDriver.loadFirefoxDriver();
                    break;
//                case "Opera":
//                    driver=OperaWebDrivers.loadOperaWebDriver();
//                    break;
                case "Safari":
                    driver=SafariWebDrivers.loadSafariDriver();
                    break;

                default:
                    throw  new IllegalArgumentException("You provider wrong Driver name");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try{
            if (driver != null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
