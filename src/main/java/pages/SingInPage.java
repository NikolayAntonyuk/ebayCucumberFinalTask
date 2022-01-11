package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingInPage extends BasePage{

    public SingInPage(WebDriver driver) {
        super(driver);
    }

    //@FindBy(xpath = "//div[@class='gigya-screen-dialog-main']")
    private WebElement signInPopup;

    //@FindBy(xpath = ".//input[@name='username'][@placeholder='Email *']")
    private WebElement emailField;

    // @FindBy(xpath = ".//input[@name='password'][contains(@placeholder, '*')]")
    private WebElement passwordField;

    // @FindBy(xpath = "//div[@class='gigya-screen-dialog-close']")
    private WebElement signInPopupCloseButton;




    public void clickSignInPopupCloseButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", signInPopupCloseButton);
    }

    public boolean isEmailFieldVisible() {
        return emailField.isDisplayed();
    }

    public boolean isPasswordFieldVisible() {
        return passwordField.isDisplayed();
    }

    public WebElement getSignInPopup() {
        return signInPopup;
    }


}
