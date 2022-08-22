package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By searchInput = By.xpath("//input[@data-view-id='main_search_form_input']");
    private By searchButton = By.xpath("//button[@data-view-id='main_search_form_button']");
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchData(String input){
        driver.findElement(searchInput).sendKeys(input);
    }

    public void ClickBtnSearch(){
        driver.findElement(searchButton).click();
    }
}
