package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//h3[@class='s-item__title']")
    private List<WebElement> wishListIcons;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickWishListOnFirstProduct() {
        wishListIcons.get(0).click();
    }

    public void nextWindow() {
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
         driver.switchTo().window(driver.getWindowHandle());
         //driver.close();
    }

}
