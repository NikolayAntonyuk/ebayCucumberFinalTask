package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//a[@id='isCartBtn_btn']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@id='binBtn_btn']")
    private WebElement buyItNowButton;

    @FindBy(xpath = "//span[@class='vi-atw-txt' and text()='Add to Watchlist']")
    private WebElement addToWatchlistButton;

    @FindBy(xpath = "//div[@id='streamline-bin-layer']")
    private WebElement addBuyNowPopupHeader;

    @FindBy(xpath = "//button[@id='sbin-signin-btn']")
    private WebElement signInButton;

    @FindBy(xpath = "//button[@id='sbin-gxo-btn']")
    private WebElement asGuestButton;

    @FindBy(xpath = "//input[@class='qtyInput']")
    private WebElement inputQuantity;


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCartButton);
    }

    public boolean isAddToCartPopupVisible() {
        return addBuyNowPopupHeader.isDisplayed();
    }

    public boolean isBuyItNowButtonVisible() {
        return buyItNowButton.isDisplayed();
    }

    public void isContinueShoppingButtonVisible() {
        signInButton.isDisplayed();
    }

    public String getAddToCartPopupHeaderText() {
        return addBuyNowPopupHeader.getText();
    }

    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void isAsGuestButtonVisible() {
        asGuestButton.isDisplayed();
    }

    public void clickAsGuestButtonButton() {
        asGuestButton.click();
    }


    public void clickBuyItNowButtonButton() {
        buyItNowButton.click();
    }

    public WebElement getAddBuyNowPopupHeader() {
        return addBuyNowPopupHeader;
    }

    public void enterTextToInputQuantityField(final String quantityText) {
        inputQuantity.clear();
        inputQuantity.sendKeys(quantityText);
    }

}
