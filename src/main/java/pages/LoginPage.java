package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {
    private WebDriver driver;

    private By nameLogin = By.cssSelector(".account-label span");

    private By btnAccount = By.xpath("//div[@data-view-id='header_header_account_container']");
    private By linkLogout = By.xpath("//p[@title='Thoát tài khoản']");
    private By phoneNumberField =By.xpath("//input[@name='tel']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By accountControl = By.xpath("//div[@class='Userstyle__UserDropDown-sc-6e6am-6 embpQf toggler']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPhoneNumber(String phone){
        driver.findElement(phoneNumberField).sendKeys(phone);
    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickButton(String cssSelector){
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public void waitForAppear(By xpath){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
    }
    public void wait(By xpath){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(xpath));
    }
    public void Login(String phoneNumber, String password){
        waitForAppear(phoneNumberField);
        enterPhoneNumber(phoneNumber);
        clickButton("form button");
        waitForAppear(passwordField);
        enterPassword(password);
        clickButton("form button");
        wait(accountControl);
//        return new SecureAreaPage(driver);
    }

    public String getNameLogin(){
        waitForAppear(nameLogin);
        return driver.findElement(nameLogin).getText();
    }

    public void LogOut(){
        waitForAppear(btnAccount);
        actions = new Actions(driver);
        WebElement s = driver.findElement(btnAccount);
        actions.moveToElement(s).perform();

        waitForAppear(linkLogout);
        driver.findElement(linkLogout).click();
    }

    Actions actions;

}