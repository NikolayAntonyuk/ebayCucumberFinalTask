package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//h1[@class='checkout-header__heading']")
    private WebElement shoppingCartTitle;

    @FindBy(xpath = "//button[@class='checkout-order-summary__continue-btn']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//button[@data-test-id='cart-remove-item']")
    private WebElement cartRemoveItem;

    @FindBy(xpath = "//div[@class='font-title-3']")
    private WebElement youDontHaveAnyItems;



    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getShoppingCartTitle() {
        return shoppingCartTitle;
    }

    public boolean isShoppingCartTitleVisible() {
        return shoppingCartTitle.isDisplayed();
    }

    public boolean isYouDontHaveAnyItemsVisible() {
        return youDontHaveAnyItems.isDisplayed();
    }






    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public void clickCartRemoveItem() {
        cartRemoveItem.click();
    }



    public WebElement getCartRemoveItem() {
        return cartRemoveItem;
    }


}
