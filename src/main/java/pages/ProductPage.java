package pages;

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

    @FindBy(xpath = "//span[@itemprop='price']")
    private WebElement valuePrice;

    @FindBy(xpath = "//span[@class='ux-layout-section-module__title']/span[text()='About this product']")
    private WebElement textAboutThisProduct;

    @FindBy(xpath = "//div[@class='reviews-left']//h2[@class='mg f17 left']")
    private WebElement textRatingsAndReviews;

    @FindBy(xpath = "//a[@class='btn btn-ter right']")
    private WebElement buttonWriteReviews;

    @FindBy(xpath = "//select[@name='Color']")
    private WebElement dropDownColor;

    @FindBy(xpath = "//select[@name='Color']/option[@id='msku-opt-0']")
    private WebElement setColor;

    @FindBy(xpath = "//select[@name='Storage Capacity']")
    private WebElement dropDownStorageCapacity;

    @FindBy(xpath = "//select[@name='Storage Capacity']/option[@id='msku-opt-4']")
    private WebElement setStorageCapacity;

    @FindBy(xpath = "//div[@id='anchor-tc']")
    private WebElement pageCaptcha;

    @FindBy(xpath = "//div[@class='u-cb err' and text()='Please select a Color']")
    private WebElement pleaseSelectColor;

    @FindBy(xpath = "//div[@class='u-cb err' and text()='Please select a Storage Capacity']")
    private WebElement pleaseSelectColorStorageCapacity;

    @FindBy(xpath = "//div[@class='u-cb err' and text()='Please enter quantity of 1 or more']")
    private WebElement pleaseEnterQuantityOf1More;

    @FindBy(xpath = "//div[@class='u-cb err' and contains(text(), 'Purchases are limited ')]")
    private WebElement purchasesAreLimited;





    public ProductPage(WebDriver driver) {
        super(driver);
    }




    public boolean isPurchasesAreLimited() {
        return purchasesAreLimited.isDisplayed();
    }

    public boolean isPleaseEnterQuantityOf1More() {
        return pleaseEnterQuantityOf1More.isDisplayed();
    }

    public boolean isPleaseSelectColorStorageCapacity() {
        return pleaseSelectColorStorageCapacity.isDisplayed();
    }

    public boolean isPleaseSelectColor() {
        return pleaseSelectColor.isDisplayed();
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

    public void isAsGuestButtonVisible() {
        asGuestButton.isDisplayed();
    }

    public void isPageCaptchaVisible() {
        pageCaptcha.isDisplayed();
    }



    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }



    public void clickAsGuestButton() {
        asGuestButton.click();
    }


    public void clickBuyItNowButtonButton() {
        buyItNowButton.click();
    }

    public void clickDropDownColor() {
        dropDownColor.click();
    }

    public void clickSetColor() {
        setColor.click();
    }

    public void clickDropDownStorageCapacity() {
        dropDownStorageCapacity.click();
    }

    public void clickSetStorageCapacity() {
        setStorageCapacity.click();
    }

    public void clickAddToWatchlistButton() {
        addToWatchlistButton.click();
    }








    public WebElement getAddBuyNowPopupHeader() {
        return addBuyNowPopupHeader;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getPageCaptcha() {
        return pageCaptcha;
    }





    public void enterTextToInputQuantityField(final String quantityText) {
        inputQuantity.clear();
        inputQuantity.sendKeys(quantityText);
    }


    public String getValuePriceText() {
        return valuePrice.getText();
    }

}
