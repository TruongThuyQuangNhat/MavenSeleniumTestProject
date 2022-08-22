package pages;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public LoginPage clickToLogin() {
        clickButton("//div[@data-view-id='header_header_account_container']");
        return new LoginPage(driver);
    }

    public SearchPage SearchData() {
        return new SearchPage(driver);
    }

    public ChatPage HomeChatPage(){
        return new ChatPage(driver);
    }

    public AddressPage HomeAddressPage(){
        return new AddressPage(driver);
    }
}
