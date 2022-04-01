package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarritoComprasPage {


    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement BTN_TSHIRTS;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement FADED_SHORT;



    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement ADD_TO_CART;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
    WebElement PROCEED_TO_CHECKOUT;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
    WebElement BTN_PROCEED_TO_CHECKOUT_SUMMARY;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement BTN_PROCEED_TO_CHECKOUT_ADDRESS;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'I agree to the terms of service and will adhere to')]")
    WebElement INPUT_TERMS_CONDITIONS;



    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement BTN_PROCEED_TO_CHECKOUT_SHIPPING;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]")
    WebElement BTN_BANK;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement CONFIRM_ORDER;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order on My Store is complete.')]")
    WebElement MESSAGE_ORDER;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'You must agree to the terms of service before cont')]")
    WebElement MESSAGE_TERMS_CONDITIONS_DISABLED;







    public WebElement getBTN_TSHIRTS() {
        return BTN_TSHIRTS;
    }

    public WebElement getFADED_SHORT() {
        return FADED_SHORT;
    }

    public WebElement getADD_TO_CART() {
        return ADD_TO_CART;
    }

    public WebElement getPROCEED_TO_CHECKOUT() {
        return PROCEED_TO_CHECKOUT;
    }

    public WebElement getBTN_PROCEED_TO_CHECKOUT_SUMMARY() {
        return BTN_PROCEED_TO_CHECKOUT_SUMMARY;
    }

    public WebElement getBTN_PROCEED_TO_CHECKOUT_ADDRESS() {
        return BTN_PROCEED_TO_CHECKOUT_ADDRESS;
    }

    public WebElement getINPUT_TERMS_CONDITIONS() {
        return INPUT_TERMS_CONDITIONS;
    }

    public WebElement getBTN_PROCEED_TO_CHECKOUT_SHIPPING() {
        return BTN_PROCEED_TO_CHECKOUT_SHIPPING;
    }

    public WebElement getBTN_BANK() {
        return BTN_BANK;
    }

    public WebElement getCONFIRM_ORDER() {
        return CONFIRM_ORDER;
    }


    public WebElement getMESSAGE_ORDER() {
        return MESSAGE_ORDER;
    }

    public WebElement getMESSAGE_TERMS_CONDITIONS_DISABLED() {
        return MESSAGE_TERMS_CONDITIONS_DISABLED;
    }

    public CarritoComprasPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
