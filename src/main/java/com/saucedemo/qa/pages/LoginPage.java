package com.saucedemo.qa.pages;

import com.saucedemo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory:
    @FindBy(name= "user-name")
    WebElement username;
    @FindBy(id= "password")
    WebElement password;
    @FindBy(xpath="//*[@id='login-button']")
    WebElement loginBtn;
   @FindBy(xpath="//div[contains(@class, 'login_logo')]")
    WebElement swagLogo;

   //Initializing the page objects:
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateSwagLogo(){
        return swagLogo.isDisplayed();
    }

    public void login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();


    }
}
