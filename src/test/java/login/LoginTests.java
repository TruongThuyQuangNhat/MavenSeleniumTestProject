package login;

import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @DataProvider(name="loginData")
    public Object[][] loginData()
    {
        Object[][] data=new Object[3][2];
        data[0][0]="0943654523";
        data[0][1]="Test-Selenium-T1k1";
        data[1][0]="0943654523";
        data[1][1]="Test-Selenium-T1k2";
        data[2][0]="0943654523";
        data[2][1]="Test-Selenium-T1k1";
        return data;
    }
    @Test(dataProvider="loginData")
    public void testSuccessLogin(String sodt, String pass) throws InterruptedException {
        LoginPage loginPage = homePage.clickToLogin();
        loginPage.Login(sodt,pass);
        Thread.sleep(2000);
        assertTrue(loginPage.getNameLogin().equals("quang nhat"), "Add address Failed!");
        loginPage.LogOut();
    }
}
