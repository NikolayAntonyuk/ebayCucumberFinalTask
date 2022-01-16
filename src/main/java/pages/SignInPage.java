package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='create-account-link']")
    private WebElement linkCreateAccount;

    @FindBy(xpath = "//input[@id='userid']")
    private WebElement inputUsername;

    @FindBy(xpath = "//button[@id='signin-continue-btn']")
    private WebElement buttonContinue;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@id='sgnBt']")
    private WebElement buttonSignInUser;

    @FindBy(xpath = "//button[@id='signin_fb_btn']")
    private WebElement buttonFacebook;

    @FindBy(xpath = "//button[@id='signin_ggl_btn']")
    private WebElement buttonGoogle;

    @FindBy(xpath = "//button[@id='signin_appl_btn']")
    private WebElement buttonApple;

    @FindBy(xpath = "//input[@class='checkbox__control']")
    private WebElement inputCheckbox;

    @FindBy(xpath = "//button[@id='gh-ug' and text()='Hi ']")
    private WebElement controlsUsernameHi;



    public void clickButtonContinue() {
        buttonContinue.click();
    }

    public void clickButtonSignInUser() {
        buttonSignInUser.click();
    }



    public boolean isControlsUsernameHiVisible() {
        return controlsUsernameHi.isDisplayed();
    }

    public boolean isUsernameVisible() {
        return inputUsername.isDisplayed();
    }

    public boolean isButtonFacebookVisible() {
        return buttonFacebook.isDisplayed();
    }

    public boolean isButtonGoogleVisible() {
        return buttonGoogle.isDisplayed();
    }

    public boolean isButtonAppleVisible() {
        return buttonApple.isDisplayed();
    }

    public void enterTextUsername(final String textUsername) {
        inputUsername.clear();
        inputUsername.sendKeys(textUsername);
    }

    public void enterTextPassword(final String textPassword) {
        inputPassword.clear();
        inputPassword.sendKeys(textPassword);
    }




}
