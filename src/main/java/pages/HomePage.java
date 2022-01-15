package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//body[@class='desktop gh-flex']")
    private WebElement header;

    @FindBy(xpath = "//footer[@id='glbfooter']")
    private WebElement footer;

    @FindBy(xpath = "//li[@id='gh-minicart-hover']//*[@class='gh-cart-icon']")
    private WebElement cartIcon;

    @FindBy(xpath = "//button[@title='Ship to']")
    private WebElement languageShipToButton;

    @FindBy(xpath = "//h3[@class='shipto__title']")
    private WebElement languagePopUpSet;

    @FindBy(xpath = "//div[@class='menu-button__item']")
    private List<WebElement> languagesCountry;

    @FindBy(xpath = "//span[@class='expand-btn__cell menu-button__control--custom-label']")
    private WebElement languageDropDown;

    @FindBy(xpath = "//div[@class='flag-wrapper']")
    private WebElement languageSelected;


    @FindBy(xpath = "//button[@class='shipto__close-btn']")
    private WebElement languagePopUpDone;

    @FindBy(xpath = "//i[@class='flgspr gh-flag-bg flaua']")
    private WebElement languageIcon;





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

    @FindBy(xpath = "//li[@id='gh-minicart-hover']//i[@id='gh-cart-n']")
    private WebElement shoppingCart;

    @FindBy(xpath = "//a[@data-test-id='start-shopping']")
    private WebElement startShopping;




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



    public void clickLanguageShipToButton() {
        languageShipToButton.click();
    }

    public void clickLanguageDropDown() {
        languageDropDown.click();
    }

    public void clickCountry() {
        languagesCountry.get(196).click();
    }

    public void clickLanguagePopUpDone() {
        languagePopUpDone.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickFreeYourselfButton() {
        freeYourselfButton.click();
    }

    public void clickRegisterButtonButton() {
        registerButton.click();
    }

    public void clickLanguageButton() {
        languageShipToButton.click();
    }

    public void clickCartButton() {
        cartIcon.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickStartShopping() {
        startShopping.click();
    }






    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }

    public void isRegisterButtonVisible() {
        registerButton.isDisplayed();
    }

    public void isLanguagePopUpSetVisible() {
        languagePopUpSet.isDisplayed();
    }

    public boolean isFreeYourselfPopupVisible() {
        return freeYourselfPopup.isDisplayed();
    }

    public void isSearchInputFieldVisible() {
        searchInputField.isDisplayed();
    }



    public WebElement getLanguagePopUpSet() {
        return languagePopUpSet;
    }

    public WebElement getLanguageSelected() {
        return languageSelected;
    }

    public WebElement isLanguageIconVisible() {
        return languageIcon;
    }


    public void enterTextToSearchField(final String searchText) {
        searchInputField.clear();
        searchInputField.sendKeys(searchText);
    }

    public WebElement getWishListProductsCount() {
        return wishListProductsCount;
    }

    public WebElement getButtonStartShopping() {
        return startShopping;
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
