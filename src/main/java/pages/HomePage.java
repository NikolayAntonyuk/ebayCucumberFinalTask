package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//body[@class='desktop gh-flex']")
    private WebElement header;

    @FindBy(xpath = "//footer[@id='glbfooter']")
    private WebElement footer;

    @FindBy(xpath = "//li[@id='gh-eb-My']//a[@class='gh-eb-li-a gh-rvi-menu']")
    private WebElement cartIcon;

    @FindBy(xpath = "//i[@class='flgspr gh-flag-bg flaua']")
    private WebElement languageButton;

    @FindBy(xpath = "//span[@id='gh-ug']/a[text()='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@id='gh-ug']//a[text()='register']")
    private WebElement registerButton;



    @FindBy(xpath = "//div[@class='hl-cta hl-banner__cta ebayui-ellipsis']//div[contains(@class, 'hl-cta__default')]")
    private WebElement freeYourselfButton;

    @FindBy(xpath = "//div[contains(@class, 'hl-color-block-banner')]//div[@class='hl-image__background']")
    private WebElement freeYourselfPopup;

    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
    private WebElement searchInputField;

    @FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@class='gh-eb-li-a gh-rvi-menu watchlist-menu']")
    private WebElement wishListProductsCount;

    @FindBy(xpath = "//li[@id='gh-minicart-hover']//a[@class='gh-eb-li-a gh-rvi-menu']")
    private WebElement shoppingCart;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void isHeaderVisible() {
        header.isDisplayed();
    }

    public void isFooterVisible() {
        footer.isDisplayed();
    }

    public void isCartIconVisible() {
        cartIcon.isDisplayed();
    }

    public String getLanguageButtonText() {
        return languageButton.getText();
    }

    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void isRegisterButtonVisible() {
        registerButton.isDisplayed();
    }





    public void clickFreeYourselfButton() {
        freeYourselfButton.click();
    }

    public boolean isFreeYourselfPopupVisible() {
        return freeYourselfPopup.isDisplayed();
    }

    public void isSearchInputFieldVisible() {
        searchInputField.isDisplayed();
    }

    public void clickCartButton() {
        cartIcon.click();
    }

    public void clickLanguageButton() {
        languageButton.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchInputField.clear();
        searchInputField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public WebElement getWishListProductsCount() {
        return wishListProductsCount;
    }

    public String getAmountOfProductsInWishList() {
        return wishListProductsCount.getText();
    }


    public WebElement getShoppingCartCount() {
        return shoppingCart;
    }

    public String getAmountOfShoppingCart() {
        return shoppingCart.getText();
    }

}
