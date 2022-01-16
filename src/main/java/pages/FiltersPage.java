package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltersPage extends BasePage{

    public FiltersPage(WebDriver driver) {
        super(driver);
    }




    @FindBy(xpath = "//button[@class='x-tray__filter']")
    private WebElement filterSelected;

    @FindBy(xpath = "//label[@class='x-refine__multi-select-label']//span[text()='New']")
    private WebElement conditionCheckBoxNew;

    @FindBy(xpath = "//label[@class='x-refine__multi-select-label']//span[text()='Used']")
    private WebElement conditionCheckBoxUsed;

    @FindBy(xpath = "//label[@class='x-refine__multi-select-label']//span[text()='Not Specified']")
    private WebElement conditionCheckBoxNotSpecified;

    @FindBy(xpath = "//span[@class='x-tray__count']")
    private WebElement filtersCount;

    @FindBy(xpath = "//input[@value='Apply']")
    private WebElement buttonApplyFilter;

    @FindBy(xpath = "//input[@aria-label='Not Specified']")
    private WebElement checkBoxNotSpecified;

    @FindBy(xpath = "//input[@aria-label='Minimum Value']")
    private WebElement inputMinimumValue;

    @FindBy(xpath = "//input[@aria-label='Maximum Value']")
    private WebElement inputMaximumValue;

    @FindBy(xpath = "//button[@title='Submit price range']")
    private WebElement buttonSubmitPrice;

    @FindBy(xpath = "//span[@class='DEFAULT' and text()='No matching items found']")
    private WebElement infoNoMatchingItemsFound;

    @FindBy(xpath = "//span[@class='DEFAULT' and text()='Clear filters']")
    private WebElement buttonClearFilters;

    @FindBy(xpath = "//h2[@class='srp-controls__count-heading' and contains(text(),'Results')]")
    private WebElement countResultsText;





    public void clickButtonClearFilters() {
        buttonClearFilters.click();
    }

    public void clickButtonSubmitPrice() {
        buttonSubmitPrice.click();
    }

    public void clickConditionCheckBoxNew() {
        conditionCheckBoxNew.click();
    }

    public void clickConditionCheckBoxUsed() {
        conditionCheckBoxUsed.click();
    }

    public void clickConditionCheckBoxNotSpecified() {
        conditionCheckBoxNotSpecified.click();
    }

    public void clickButtonApplyFilter() {
        buttonApplyFilter.click();
    }



    public boolean isFilterSelectedVisible() {
        return filterSelected.isDisplayed();
    }

    public boolean isCheckBoxNotSpecifiedVisible() {
        return checkBoxNotSpecified.isDisplayed();
    }

    public boolean isInfoNoMatchingItemsFound() {
        return infoNoMatchingItemsFound.isDisplayed();
    }

    public boolean isCountResultsText() {
        return countResultsText.isDisplayed();
    }


    public String getAmountOfFiltersCount() {
        return filtersCount.getText();
    }


    public WebElement getCheckBoxNotSpecified() {
        return checkBoxNotSpecified;
    }

    public WebElement getFilterSelected() {
        return filterSelected;
    }




    public void enterMinimumValueField(final String valuePrise) {
        inputMinimumValue.clear();
        inputMinimumValue.sendKeys(valuePrise);
    }

    public void enterMaximumValueField(final String valuePrise) {
        inputMaximumValue.clear();
        inputMaximumValue.sendKeys(valuePrise);
    }

}
