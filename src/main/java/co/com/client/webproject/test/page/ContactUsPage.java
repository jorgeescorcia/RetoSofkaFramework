package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement BTN_CONTACT_US;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_contact']")
    WebElement SUBJECT;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement EMAIL;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/select[1]")
    WebElement ORDER_REFERENCE;



    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement MESSAGE;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]")
    WebElement BTN_SEND;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Your message has been successfully sent to our tea')]")
    WebElement MESSAGE_SUCCESSFULLY;

    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
    WebElement MESSAGE_FAILED;



    public WebElement getBTN_CONTACT_US() {
        return BTN_CONTACT_US;
    }

    public WebElement getSUBJECT() {
        return SUBJECT;
    }

    public WebElement getEMAIL() {
        return EMAIL;
    }

    public WebElement getORDER_REFERENCE() {
        return ORDER_REFERENCE;
    }

    public WebElement getMESSAGE() {
        return MESSAGE;
    }

    public WebElement getBTN_SEND() {
        return BTN_SEND;
    }

    public WebElement getMESSAGE_SUCCESSFULLY() {
        return MESSAGE_SUCCESSFULLY;
    }

    public WebElement getMESSAGE_FAILED() {
        return MESSAGE_FAILED;
    }

    public ContactUsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
