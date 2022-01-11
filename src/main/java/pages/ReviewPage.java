package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage{
    public ReviewPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@id='star1']")
    private WebElement buttonStar1;

    @FindBy(xpath = "//input[@id='star2']")
    private WebElement buttonStar2;

    @FindBy(xpath = "//input[@id='star3']")
    private WebElement buttonStar3;

    @FindBy(xpath = "//input[@id='star4']")
    private WebElement buttonStar4;

    @FindBy(xpath = "//input[@id='star5']")
    private WebElement buttonStar5;

    @FindBy(xpath = "//label[@for='q_55bba1c9e4b0e12ba3df602e_0']")
    private WebElement buttonYesDoYouRecommend;

    @FindBy(xpath = "//label[@for='q_55bba1c9e4b0e12ba3df602e_1']")
    private WebElement buttonNoDoYouRecommend;

    @FindBy(xpath = "//label[@for='q_55bba1c9e4b0e12ba3df6032_0']")
    private WebElement buttonYesGoodValue;

    @FindBy(xpath = "//label[@for='q_55bba1c9e4b0e12ba3df6032_1']")
    private WebElement buttonNoGoodValue;

    @FindBy(xpath = "//label[@for='q_55bba1c9e4b0e12ba3df6036_0']")
    private WebElement buttonYesGoodQuality;

    @FindBy(xpath = "//label[@for='q_55bba1c9e4b0e12ba3df6036_1']")
    private WebElement buttonNoGoodQuality;

    @FindBy(xpath = "//textarea[@class='textbox__control']")
    private WebElement inputWriteYourProduct;

    @FindBy(xpath = "//input[@class='textbox__control']")
    private WebElement inputReviewTitle;

    @FindBy(xpath = "//button[@aria-label=' Add a photo']")
    private WebElement addAPhoto;

    @FindBy(xpath = "//a[@class='war-cancel']")
    private WebElement buttonCancel;

    @FindBy(xpath = "//button[@class='btn btn--primary submit-btn']")
    private WebElement buttonSubmit;








}
