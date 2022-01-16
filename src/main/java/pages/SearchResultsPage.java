package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//h3[@class='s-item__title']")
    private List<WebElement> wishListIcons;

    @FindBy(xpath = "//a[@title='Advanced Search']")
    private WebElement buttonAdvancedSearch;

    @FindBy(xpath = "//input[@id='_nkw']")
    private WebElement inputItemNumber;

    @FindBy(xpath = "//input[@id='_ex_kw']")
    private WebElement inputItemExclude;

    @FindBy(xpath = "//div[@class='adv-s mb space-top']//button")
    private WebElement buttonSearch;

    @FindBy(xpath = "//span[@class='rcnt']")
    private WebElement countSearch;



    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickWishListOnFirstProduct() {
        wishListIcons.get(0).click();
    }

    public void clickButtonAdvancedSearch() {
        buttonAdvancedSearch.click();
    }

    public void clickButtonSearch() {
        buttonSearch.click();
    }


    public void enterInputItemNumber(final String Item) {
        inputItemNumber.clear();
        inputItemNumber.sendKeys(Item);
    }

    public void enterInputItemExclude(final String Item) {
        inputItemExclude.clear();
        inputItemExclude.sendKeys(Item);
    }

    public String getCountSearch() {
        return countSearch.getText();
    }


}
