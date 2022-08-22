package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class ChatPage {
    private WebDriver driver;

    private By chatBtn = By.xpath("//div[@id='chat-platform']");

    private By inputSearchChat = By.id("filter-search-input");

    private By searchNhaBan = By.id("filter-by-value-search");

    private By listShop = By.className("styles__StyledChannelItem-sc-1p7z00k-0");

    private By inputChat = By.id("input-chat");

    private By sendChat = By.id("input-chat-send");

    public ChatPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterChatBtn(){
        waitForAppear(chatBtn);
        driver.findElement(chatBtn).click();
    }

    public void enterSearchChat(String input){
        waitForAppear(inputSearchChat);
        driver.findElement(inputSearchChat).sendKeys(input);
    }

    public void enterSearchNhaBan(){
        waitForAppear(searchNhaBan);
        ArrayList<WebElement> lst = (ArrayList<WebElement>) driver.findElements(searchNhaBan);
        WebElement s = lst.get(0);
        s.click();
    }

    public void chooseShop(int index){
        waitForAppear(listShop);
        ArrayList<WebElement> lstShop = (ArrayList<WebElement>) driver.findElements(listShop);
        WebElement s = lstShop.get(index);
        s.click();
    }

    public void enterInputChat(String input){
        waitForAppear(inputChat);
        driver.findElement(inputChat).sendKeys(input);
    }

    public void enterSendChat(){
        waitForAppear(sendChat);
        driver.findElement(sendChat).click();
    }

    public void waitForAppear(By xpath){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
    }
}
