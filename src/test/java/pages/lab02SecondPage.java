package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

public class lab02SecondPage extends BrowserUtils {

    public lab02SecondPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName ="h1")
    private WebElement verifyAddTariffPlan;
    @FindBy(id = "rental1")
    private WebElement MonthlyRental;
    @FindBy(id = "local_minutes")
    private WebElement FreeLocalMinutes;
    @FindBy(id = "inter_minutes")
    private WebElement FreeIntMinutes;
    @FindBy(id = "sms_pack")
    private WebElement SmsPack;
    @FindBy(id = "minutes_charges")
    private WebElement LocalPerMinutesCharge;
    @FindBy(id = "inter_charges")
    private WebElement IntPerMinutesCharge;
    @FindBy(id = "sms_charges")
    private WebElement SmsCharge;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submit;


    //The user wants to verify "Add Tariff Plans" headerr
    public void setVerifyAddTariffPlan(String expectedMessage){
        Assert.assertEquals(verifyAddTariffPlan.getText(),expectedMessage);

    }
    public void setMonthlyRental(String monthlyRental) {

        MonthlyRental.sendKeys(monthlyRental);
    }

    public void setFreeLocalMinutes(String freeLocalMinutes) {

        FreeLocalMinutes.sendKeys(freeLocalMinutes);
    }

    public void setFreeIntMinutes(String freeIntMinutes) {

        FreeIntMinutes.sendKeys(freeIntMinutes);

    }

    public void setSmsPack(String smsPack) {

        SmsPack.sendKeys(smsPack);

    }

    public void setLocalPerMinutesCharge(String localPerMinutesCharge) {

        LocalPerMinutesCharge.sendKeys(localPerMinutesCharge);
    }

    public void setIntPerMinutesCharge(String intPerMinutesCharge) {

        IntPerMinutesCharge.sendKeys(intPerMinutesCharge);
    }

    public void setSmsCharge(String smsCharge) {

        SmsCharge.sendKeys(smsCharge);
    }

    public void setSubmit() {
        submit.click();


    }
}