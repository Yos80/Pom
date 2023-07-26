package com.saucedemo.qa.testcases;

import com.saucedemo.qa.base.TestBase;
import com.saucedemo.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;

    public LoginPageTest(){
        super();
    }

    @BeforeClass
    public void setUp(){
        init();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title,"Sw3ag Labs");
    }

    @Test(priority = 2)
    public void swagLogoTest(){
       boolean flag =  loginPage.validateSwagLogo();
       Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void loginTest(){
     loginPage.login(prop.getProperty("username"), prop.getProperty("password"));


    }

    @Test(priority = 4)
    public void swagTest(){
        throw new SkipException("Skipping this test");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
