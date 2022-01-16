package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    private static final String EXPECTED_SEARCH_QUERY = "splashui/captcha?";
    private static final String EXPECTED_URL_EBAY = "https://www.ebay.com/";
    private static final String EXPECTED_URL_BLOGS = "https://www.ebayinc.com/";
    private static final String EXPECTED_URL_FACEBOOK = "https://www.facebook.com/ebay/";
    private static final String EXPECTED_URL_TWITTER = "https://twitter.com/eBay";


    WebDriver driver;
    HomePage homePage;
    ShoppingCartPage shoppingCartPage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
    CheckoutPage checkoutPage;
    PageFactoryManager pageFactoryManager;
    SignInPage singInPage;
    SignUpPage signUpPage;
    FiltersPage filtersPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks header visibility")
    public void checkHeaderVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.isHeaderVisible();
    }

    @And("User checks search field visibility")
    public void checkSearchVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.isSearchInputFieldVisible();
    }

    @And("User checks footer visibility")
    public void checkFooterVisibility() {
        homePage.isFooterVisible();
    }

    @And("User checks cart visibility")
    public void checkCartVisibility() {
        homePage.isCartIconVisible();
    }



    @And("User checks register button visibility")
    public void checkRegisterButtonVisibility() {
        homePage.isRegisterButtonVisible();
    }

    @And("User checks sign in button visibility")
    public void checkSignInButtonVisibility() {
        homePage.isSignInButtonVisible();
    }





    @And("User opens store popup")
    public void openStorePopup() {
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.clickFreeYourselfButton();
    }

    @And("User checks that store popup visible")
    public void checkStorePopupVisibility() {
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(homePage.isFreeYourselfPopupVisible());
    }

    @And("User opens shopping cart")
    public void openShoppingCart() {
        homePage.clickCartButton();
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        shoppingCartPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        shoppingCartPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        shoppingCartPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, shoppingCartPage.getShoppingCartTitle());
    }

    @When("User clicks language button")
    public void clickLanguageButton() {
        homePage.clickLanguageButton();
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
    }

    @And("User checks that current url contains {string} language")
    public void checkCurrentUrl(final String language) {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(driver.getCurrentUrl().contains(language));
    }

    @And("User checks that shopping cart title visible")
    public void checkShoppingCartTitleVisibility() {
        assertTrue(shoppingCartPage.isShoppingCartTitleVisible());
    }

    @And("User makes search by keyword {string}")
    public void enterKeywordToSearchField(final String keyword) {
        homePage.enterTextToSearchField(keyword);
    }

    @And("User clicks search button")
    public void clickSearchButton() throws InterruptedException {
        sleep(1500);//потому что баг, вам так делать нельзя!!!
        homePage.clickSearchButton();
    }

    @And("User clicks 'Add to Cart' button on product")
    public void clickAddToCart() {
        productPage = pageFactoryManager.getProductPage();
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getAddToCartButton());
        productPage.clickDropDownColor();
        productPage.clickSetColor();
        productPage.clickDropDownStorageCapacity();
        productPage.clickSetStorageCapacity();
        productPage.clickAddToCartButton();
    }

    @And("User checks that add to cart popup visible")
    public void checkAddToCartPopupVisibility() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getAddBuyNowPopupHeader());
        assertTrue(productPage.isAddToCartPopupVisible());
    }

    @And("User checks 'Continue Shopping' button visibility")
    public void checkContinueShoppingButtonVisibility() {
        productPage.isContinueShoppingButtonVisible();
    }

    @And("User checks 'Continue to Cart' button visibility")
    public void checkContinueToCartButtonVisibility() {
        productPage.isSignInButtonVisible();
    }

    @And("User checks that add to cart popup header is {string}")
    public void checkAddToCartPopupHeader(final String expectedText) {
        assertEquals(productPage.getAddToCartPopupHeaderText(), expectedText);
    }

    @And("User clicks 'Continue to Cart' button")
    public void clickContinueToCartButton() {
        productPage.clickSignInButton();
    }

    @And("User clicks 'Checkout' button")
    public void clickCheckoutButton() {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        shoppingCartPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, shoppingCartPage.getShoppingCartTitle());
        shoppingCartPage.clickCheckoutButton();
    }

    @And("User clicks payment cart button")
    public void clickPaymentCartButton() {
        checkoutPage = pageFactoryManager.getCheckoutPage();
        checkoutPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        checkoutPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        checkoutPage.clickPaymentCartButton();
    }

    @And("User checks payment form visibility")
    public void checkPaymentFormVisibility() {
        assertTrue(checkoutPage.isPaymentFormVisible());
    }

    @And("User checks billing form visibility")
    public void checkBillingFormVisibility() {
        assertTrue(checkoutPage.isBillingFormVisible());
    }

    @And("User checks 'Complete Order' button visibility")
    public void checkCompleteOrderButtonVisibility() {
        assertTrue(checkoutPage.isCompleteOrderButtonVisible());
    }

    @And("User clicks wish list on first product")
    public void clickWishList() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.clickWishListOnFirstProduct();
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        searchResultsPage.nextWindow();
    }



    @And("User checks that amount of products in wish list are {string}")
    public void checkAmountOfProductsInWishList(final String expectedAmount) {
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        productPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getShoppingCartCount());
        assertEquals(homePage.getAmountOfShoppingCart(), expectedAmount);
    }



    @And("User checks language visibility")
    public void userChecksLanguageVisibility() {
        homePage.clickLanguageShipToButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getLanguagePopUpSet());
        homePage.isLanguagePopUpSetVisible();
        homePage.clickLanguageDropDown();



    }





    @And("User clicks language Country")
    public void userClicksLanguageCountry() {
        homePage.clickCountry();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.isLanguageIconVisible());
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getLanguageSelected());
        homePage.clickLanguagePopUpDone();
    }

    @And("User checks selected language")
    public void userChecksSelectedLanguage() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.isLanguageIconVisible());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @And("User checks home page field visibility")
    public void userChecksHomePageFieldVisibility() {
        homePage.isRegisterButtonVisible();
        homePage.isSearchInputFieldVisible();
    }

    @And("User click button registration")
    public void userClickButtonRegistration() {
        homePage.clickSignInButton();
    }

    @And("User clicks Add button on product")
    public void userClicksAddToFavoriteButtonOnProduct() {
        productPage = pageFactoryManager.getProductPage();
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getAddToCartButton());
        productPage.clickDropDownColor();
        productPage.clickSetColor();
        productPage.clickDropDownStorageCapacity();
        productPage.clickSetStorageCapacity();
        productPage.clickAddToWatchlistButton();



    }

    @Then("User checks that lock captcha checking")
    public void userChecksThatLockCaptchaChecking() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(driver.getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));

    }

    @And("User clicks Cart Remove Item")
    public void userClicksCartRemoveItem() {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        shoppingCartPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        shoppingCartPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        shoppingCartPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, shoppingCartPage.getCartRemoveItem());
        shoppingCartPage.clickCartRemoveItem();
    }

    @And("User clicks Cart Item")
    public void userClicksCartItem() {
        homePage = pageFactoryManager.getHomePage();
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getButtonStartShopping());
        homePage.clickStartShopping();

    }

    @Then("User checks that amount of products in cart is empty")
    public void userChecksThatAmountOfProductsInCartIsEmpty() {
        homePage.clickCartButton();
        assertTrue(shoppingCartPage.isYouDontHaveAnyItemsVisible());
    }

    @And("User clicks Add to Cart button on product validity")
    public void userClicksAddToCartButtonOnProductValidity() {
        productPage = pageFactoryManager.getProductPage();
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getAddToCartButton());
        productPage.clickAddToCartButton();

    }

    @Then("User checks without select Color")
    public void userChecksWithoutSelectColor() {
        assertTrue(productPage.isPleaseSelectColor());
        productPage.clickDropDownColor();
        productPage.clickSetColor();
        productPage.clickAddToCartButton();
        assertFalse(productPage.isPleaseSelectColor());
    }

    @And("User checks without select StorageCapacity")
    public void userChecksWithoutSelectStorageCapacity() {
        assertTrue(productPage.isPleaseSelectColorStorageCapacity());
        productPage.clickDropDownStorageCapacity();
        productPage.clickSetStorageCapacity();
        assertFalse(productPage.isPleaseSelectColorStorageCapacity());
    }


    @And("User checks without select {string}")
    public void userChecksWithoutSelectQuantity(final String expectedAmount) {
        productPage.enterTextToInputQuantityField(expectedAmount);
        assertTrue(productPage.isPleaseEnterQuantityOf1More());
        productPage.enterTextToInputQuantityField("999");
        assertTrue(productPage.isPurchasesAreLimited());
        productPage.clickAddToCartButton();
    }

    @And("User click on 'Free yourself' button")
    public void userClickOnFreeYourselfButton() {
        homePage.isFreeYourselfPopupVisible();
        homePage.clickFreeYourselfButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);

    }

    @When("User click on 'More refinements...'")
    public void userClickOnMoreRefinements() {
        homePage.clickMoreRefinements();
        filtersPage = pageFactoryManager.getFiltersPage();
        filtersPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, filtersPage.getFilterSelected());
        assertTrue(filtersPage.isFilterSelectedVisible());

    }

    @And("User clicks on checkbox filter {string}")
    public void userClicksOnCheckboxFilter(final String expectedAmount) {
        filtersPage.clickConditionCheckBoxNew();
        filtersPage.clickConditionCheckBoxUsed();
        filtersPage.clickConditionCheckBoxNotSpecified();
        filtersPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertEquals(filtersPage.getAmountOfFiltersCount(), expectedAmount);
    }

    @And("User clicks 'Apply Filter' button")
    public void userClicksApplyFilterButton() {
        filtersPage.clickButtonApplyFilter();
    }

    @Then("User checks selected filters")
    public void userChecksSelectedFilters() {
        filtersPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        filtersPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, filtersPage.getCheckBoxNotSpecified());

    }


    @When("User click on input Price button {string} value")
    public void userClickOnInputPriceButtonPriceValue(final String Price) {
        filtersPage = pageFactoryManager.getFiltersPage();
        filtersPage.enterMinimumValueField(Price);
        filtersPage.enterMaximumValueField(Price);
        filtersPage.clickButtonSubmitPrice();
    }

    @Then("User checks selected Price filters")
    public void userChecksSelectedPriceFilters() {
        filtersPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(filtersPage.isInfoNoMatchingItemsFound());


    }

    @And("User click on Clear Filters")
    public void userClickOnClearFilters() {
        filtersPage.clickButtonClearFilters();
        filtersPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(filtersPage.isCountResultsText());


    }

    @When("User click on input eBay's Blogs")
    public void userClickOnInputEBaySBlogs() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickButtonBlogs();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(driver.getCurrentUrl().contains(EXPECTED_URL_BLOGS));
        driver.navigate().back();
    }

    @And("User click on input Facebook")
    public void userClickOnInputFacebook() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickButtonFacebook();
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getIconFacebook());
        assertTrue(driver.getCurrentUrl().contains(EXPECTED_URL_FACEBOOK));
        driver.navigate().back();
    }

    @And("User click on input Twitter")
    public void userClickOnInputTwitter() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickButtonTwitter();
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getIconTwitter());
        assertTrue(driver.getCurrentUrl().contains(EXPECTED_URL_TWITTER));
        driver.navigate().back();


    }

    @Then("User checks going to page mine")
    public void userChecksGoingToPageMine() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(driver.getCurrentUrl().contains(EXPECTED_URL_EBAY));

    }

    @And("User click on Advanced search")
    public void userClickOnAdvancedSearch() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.clickButtonAdvancedSearch();
    }

    @When("User click on inputs Enter keywords or {string}")
    public void userClickOnInputsEnterKeywordsOrItemNumber(final String Item) {
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.enterInputItemNumber(Item);

    }

    @And("User click on input {string} words from your search")
    public void userClickOnInputExcludeWordsFromYourSearch(final String Exclude) {
        searchResultsPage.enterInputItemExclude(Exclude);
    }

    @Then("User checks selected Search")
    public void userChecksSelectedSearch() {
        searchResultsPage.clickButtonSearch();
    }

    @And("User checks {string} search")
    public void userChecksQuantitySearch(final String expectedAmount) {
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(searchResultsPage.getCountSearch(), expectedAmount);
    }


    @When("User clicks 'Sign In' button")
    public void clickSignInButton() {
        homePage.clickSignInButton();
    }


    @When("User makes fields by keyword {string}")
    public void userMakesFieldsByKeywordUsername(final String username) {
        singInPage = pageFactoryManager.getSignInPage();
        singInPage.enterTextUsername(username);
    }

    @And("User clicks Continue button")
    public void userClicksContinueButton() {
        singInPage.clickButtonContinue();
    }

    @And("User makes fields {string} by keyword")
    public void userMakesFieldsPasswordByKeyword(final String password) {
        singInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        singInPage.enterTextPassword(password);
    }

    @And("User clicks Sign in button")
    public void userClicksSignInButton() {
        singInPage.clickButtonSignInUser();
    }

    @Then("User checks that Hi Stacey!")
    public void userChecksThatHiStacey() {
        singInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(singInPage.isControlsUsernameHiVisible());

    }
}
