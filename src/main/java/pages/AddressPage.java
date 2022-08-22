package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AddressPage {
    private WebDriver driver;

    private By btnAccount = By.xpath("//div[@data-view-id='header_header_account_container']");

    private By btnMyAccount = By.xpath("//a[@href='/customer/account/edit?src=header_my_account']");

    private By btnSoDiaChi = By.xpath("//a[@href='/customer/address']");

    private By btnThemDiaChiMoi = By.xpath("//a[@href='/customer/address/create']");

    private By inputCongTy = By.xpath("//input[@name='company']");
    private By inputSoDienThoai = By.xpath("//input[@name='telephone']");
    private By selectThanhPho = By.xpath("//option[@value='303']");
    private By selectQuanHuyen = By.xpath("//option[@value='272']");
    private By selectPhuongXa = By.xpath("//option[@value='10120']");
    private  By inputDiaChi = By.xpath("//textarea[@name='street']");
    private By btnSubmit = By.xpath("//button[@class='btn-submit']");

    private By item = By.xpath("//div[@class='item']");
    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    Actions actions;
    public void hoverBtnAccount(){
        waitForAppear(btnAccount);
        actions = new Actions(driver);
        WebElement s = driver.findElement(btnAccount);
        actions.moveToElement(s).perform();
    }

    public void enterBtnMyAccount(){
        waitForAppear(btnMyAccount);
        WebElement btnMyAcc = driver.findElement(btnMyAccount);
        btnMyAcc.click();
    }

    public void enterBtnSoDiaChi(){
        waitForAppear(btnSoDiaChi);
        WebElement btnSDC = driver.findElement(btnSoDiaChi);
        btnSDC.click();
    }

    public void enterBtnThemMoiDiaChi(){
        waitForAppear(btnThemDiaChiMoi);
        WebElement btnTMDC = driver.findElement(btnThemDiaChiMoi);
        btnTMDC.click();
    }

    public void enterCongTy(){
        waitForAppear(inputCongTy);
        WebElement inputCT = driver.findElement(inputCongTy);
        inputCT.sendKeys("LogiGear Hue");
    }

    public void enterSoDienThoai(){
        waitForAppear(inputSoDienThoai);
        WebElement inputSDT = driver.findElement(inputSoDienThoai);
        inputSDT.sendKeys("0943654523");
    }

    public void chooseThanhPho(){
        waitForAppear(selectThanhPho);
        WebElement TP = driver.findElement(selectThanhPho);
        TP.click();
    }

    public void chooseQuanHuyen(){
        waitForAppear(selectQuanHuyen);
        WebElement TP = driver.findElement(selectQuanHuyen);
        TP.click();
    }

    public void choosePhuongXa(){
        waitForAppear(selectPhuongXa);
        WebElement TP = driver.findElement(selectPhuongXa);
        TP.click();
    }

    public void enterDiaChi(){
        waitForAppear(inputDiaChi);
        WebElement dc = driver.findElement(inputDiaChi);
        dc.sendKeys("10 Nguyen Huu Dat");
    }

    public void enterSubmit(){
        waitForAppear(btnSubmit);
        WebElement sm = driver.findElement(btnSubmit);
        sm.click();
    }

    public List<WebElement> getList(){
        List<WebElement> lst = driver.findElements(item);
        return lst;
    }
    public void waitForAppear(By xpath){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
    }
}
