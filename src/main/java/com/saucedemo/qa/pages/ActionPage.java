package com.saucedemo.qa.pages;

import com.saucedemo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionPage extends TestBase {

    Actions act = new Actions(driver);

    //Page Factory:
    @FindBy(id = "double-click")
    public WebElement doubleClickAction;
    @FindBy(id = "click-box")
    public WebElement clickNHoldAction;


    //Initializing the page objects:
    public ActionPage() {
        PageFactory.initElements(driver, this);
    }

    //Actions:

    public String convertBgColorStringToHex() {
        String s = doubleClickAction.getCssValue("background-color");
        // convert rgba to hex
        return Color.fromString(s).asHex();
    }



    public void doubleClickElement(){
        act.doubleClick(doubleClickAction).perform();
    }
    public void clickElement(){
        clickNHoldAction.click();
    }

    public void clickNHoldElement(){
        act.clickAndHold(clickNHoldAction).perform();
    }

}







