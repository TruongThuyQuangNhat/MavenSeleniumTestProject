package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchPage;

public class SearchTests extends BaseTests {
    @Test
    public void testSuccessSearch() throws InterruptedException {
        LoginPage loginPage = homePage.clickToLogin();
        loginPage.Login("0943654523","Test-Selenium-T1k1");
        Thread.sleep(2000);
        SearchPage searchPage = homePage.SearchData();
        searchPage.enterSearchData("chuot khong day");
        searchPage.ClickBtnSearch();
    }
}
