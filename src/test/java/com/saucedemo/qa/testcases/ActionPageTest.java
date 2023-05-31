package com.saucedemo.qa.testcases;

import com.saucedemo.qa.base.TestBase;
import com.saucedemo.qa.pages.ActionPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionPageTest extends TestBase {

    ActionPage actionPage;


    public ActionPageTest(){
        super();
    }

    @BeforeClass
    public void setUp(){
        init();
        actionPage = new ActionPage();
        driver.get(prop.getProperty("url2"));
    }

    @Test(priority = 1)
    public void doubleClickElementToChangeColor() {
        Assert.assertEquals(actionPage.convertBgColorStringToHex(), "#fec42d");
        actionPage.doubleClickElement();
        Assert.assertEquals(actionPage.convertBgColorStringToHex(), "#93cb5a");
    }

    @Test(priority = 2)
    public void clickNHoldElementToSeeText() {
        actionPage.clickElement();
        String ActualTitle = actionPage.clickNHoldAction.getText();
        String ExpectedTitle = "Dont release me!!!";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        actionPage.clickNHoldElement();
        String ActualTitle1 = actionPage.clickNHoldAction.getText();
        String ExpectedTitle1 = "Well done! keep holding that click now.....";
        Assert.assertEquals(ExpectedTitle1, ActualTitle1);
    }



    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
