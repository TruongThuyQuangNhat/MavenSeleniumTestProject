package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void goHome(){
        driver.manage().window().maximize();
        driver.get("https://tiki.vn/");
        homePage = new HomePage(driver);
    }

//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}
