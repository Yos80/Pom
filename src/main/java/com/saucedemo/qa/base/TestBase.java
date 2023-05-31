package com.saucedemo.qa.base;

import com.saucedemo.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

public static WebDriver driver;

public static Properties prop;

public TestBase(){
    try {
        prop = new Properties();
        FileInputStream ip = new FileInputStream(
                System.getProperty("user.dir") + "/src/main/java/com/saucedemo/qa/config/config.properties");
        prop.load(ip);

    } catch (IOException e){
        e.printStackTrace();
    }
}

public static void init(){
    String browserName = prop.getProperty("browser");

    if(browserName.equals("chorme")){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yosi Stavi\\IdeaProjects\\SaucedemoTestAutomation\\drivers\\chromedriver.exe");

    }
    driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

    driver.get(prop.getProperty("url"));

}
}
