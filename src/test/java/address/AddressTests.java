package address;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.LoginPage;

import java.sql.SQLOutput;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class AddressTests extends BaseTests {
    @Test
    public void TestAddress() throws InterruptedException {
        LoginPage loginPage = homePage.clickToLogin();
        loginPage.Login("0943654523","Test-Selenium-T1k1");
        AddressPage addressPage = homePage.HomeAddressPage();

        Thread.sleep(5000);
        addressPage.hoverBtnAccount();
        Thread.sleep(2000);
        addressPage.enterBtnMyAccount();
        addressPage.enterBtnSoDiaChi();
        List<WebElement> lst = addressPage.getList();

        addressPage.enterBtnThemMoiDiaChi();
        addressPage.enterCongTy();
        addressPage.enterSoDienThoai();
        addressPage.chooseThanhPho();
        addressPage.chooseQuanHuyen();
        addressPage.choosePhuongXa();
        addressPage.enterDiaChi();

        addressPage.enterSubmit();
        List<WebElement> lst2 = addressPage.getList();
        assertTrue(lst.size() == lst2.size() - 1, "Add address Failed!");
    }
}
