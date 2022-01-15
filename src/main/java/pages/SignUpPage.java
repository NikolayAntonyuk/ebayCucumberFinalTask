package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@value='personalaccount']")
    private WebElement radioButtonPersonalAccount;

    @FindBy(xpath = "//input[@value='businessaccount']")
    private WebElement radioButtonBusinessAccount;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement inputFirstname;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement inputLastname;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@id='showpassword']")
    private WebElement inputShowPassword;

    @FindBy(xpath = "//button[@id='google']")
    private WebElement buttonGoogle;

    @FindBy(xpath = "//button[@id='facebook']")
    private WebElement buttonFacebook;

    @FindBy(xpath = "//button[@id='apple']")
    private WebElement buttonApple;

//Business account

    @FindBy(xpath = "//input[@id='businessName']")
    private WebElement inputBusinessName;

    @FindBy(xpath = "//input[@id='businessEmail']")
    private WebElement inputBusinessEmail;

    @FindBy(xpath = "//input[@id='bizPassword']")
    private WebElement inputBizPassword;

    @FindBy(xpath = "//input[@id='showbizPassword']")
    private WebElement inputShowBizPassword;

    @FindBy(xpath = "//select[@id='businessCountry']")
    private WebElement dropDownBusinessCountry;

    @FindBy(xpath = "//input[@id='bizOnlyToBuy']")
    private WebElement inputBizOnlyToBuy;

    @FindBy(xpath = "//button[@id='BUSINESS_REG_FORM_SUBMIT']")
    private WebElement buttonCreateAccount;


    public void openHomePage(String url) {
        driver.get(url);
    }






}
